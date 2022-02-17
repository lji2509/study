package springweb.a02_mvc.a03_dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.vo.FileInfo;

@Repository
public interface A03_FileDao {
	public void insertFileInfo(FileInfo ins);
	public ArrayList<FileInfo> getFileList();
}
