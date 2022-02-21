package board.a03_dao;

import java.util.ArrayList;
import java.util.List;

import board.a04_vo.Board;
import board.a04_vo.FileInfo;

// board.a03_dao.Dao
public interface BoardDao {
	public List<Board> getBoardList(Board sch);
	public void insertBoard(Board ins);
	public void insertFileInfo(FileInfo ins);
	public Board getBoard(int no);
	public ArrayList<String> getFileInfo(int fno);
	public void deleteBoard(int no);
}
