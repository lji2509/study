package board.a02_service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import board.a03_dao.BoardDao;
import board.a04_vo.Board;
import board.a04_vo.BoardSch;
import board.a04_vo.FileInfo;
import board.a04_vo.Member;

@Service
public class BoardService {
	@Autowired
	private BoardDao dao;
	
	public List<Board> getBoardList(BoardSch sch) {
		//1. 전체 갯수
		//총건수를 화면에 출력하려면 BoardSch에 설정. 모델 데이터로 활용할 수 있다.
		sch.setCount(dao.totcnt(sch));
		//2. 한번에 보일 페이지 수 초기값 설정
			//1) 초기에는 0이기에 5개로 설정 처리
		if(sch.getPageSize()==0) {
			sch.setPageSize(5);
		}
		System.out.println(sch.getPageSize());
		//3. 총 페이지 수(전체갯수, 한번에 보일 페이지 수)
		sch.setPageCount((int)Math.ceil((double)sch.getCount()/(double)sch.getPageSize()));
		//4. 클릭한 현재 페이지 호출
			//현재페이지 초기값 0==>1
		if(sch.getCurPage()==0) {
			sch.setCurPage(1);
		}		
		//5. 시작번호
		sch.setStart((sch.getCurPage()-1)*sch.getPageSize()+1);
		//6. 마지막번호
		sch.setEnd(sch.getCurPage()*sch.getPageSize());
		//7. 하단의 페이지 block 처리
			//1) 페이지 block의 크기 지정
		sch.setBlockSize(5);
			//2) 현재 블럭 그룹 번호 : 현재 클릭한 페이지번호/블럭의 크기
		int curBlockGrpNo = (int)Math.ceil(sch.getCurPage()/(double)sch.getBlockSize());
			//3) 블럭 그룹의 시작 페이지 번호
		sch.setStartBlock((curBlockGrpNo-1)*sch.getBlockSize()+1);
			//4) 블럭 그룹의 마지막 페이지 번호
				//총페이지수보다 크면 총페이지수를 마지막페이지 번호
		int endBlockGrpNo = curBlockGrpNo*sch.getBlockSize();
		sch.setEndBlock(endBlockGrpNo>sch.getPageCount()?sch.getPageCount():endBlockGrpNo);
			
		return dao.getBoardList(sch);
	}
	
	@Value("${upload}")
	private String uploadPath;
	
	public String insertBoard(Board ins) {
		dao.insertBoard(ins);
		
		String msg = "등록성공";
		//특정한 위치에 첨부파일 업로드
		if(ins.getReport()!=null && ins.getReport().length>0) {
			try {
				for(MultipartFile mf : ins.getReport()) {
					String fname = mf.getOriginalFilename();
					if(fname!=null && !fname.equals("")) {
						System.out.println("첨부파일명 : " + fname);
						File file = new File(uploadPath + fname);
							mf.transferTo(file);
							//첨부파일 정보 DB에 등록
							dao.insertFileInfo(new FileInfo(uploadPath, fname, "게시물 제목 : " + ins.getTitle()));
					}
				}
			} catch (IllegalStateException e) {
				msg = e.getMessage();
			} catch (IOException e) {
				msg = "파일전송오류 : " + e.getMessage();
			}
		}
		return msg;
	}
	
	public Board getBoard(int no) {
		dao.updateReadCnt(no);
		//Board 안에 상세 정보와 다운로드할 파일 정보를 설정되게 했다.
		Board b = dao.getBoard(no);
		b.setFnames(dao.getFileInfo(no));
		return b;
	}
	
	public ArrayList<String> getFileInfo(int fno) {
		return dao.getFileInfo(fno);
	}
	
	public void deleteBoard(int no) {
		dao.deleteBoard(no);
	}
	
	public Member login(Member m) {
		return dao.login(m);
	}
	
	public void updateBoard(Board upt) {
		dao.updateBoard(upt);
	}
}
