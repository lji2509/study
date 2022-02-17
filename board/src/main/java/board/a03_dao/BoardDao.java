package board.a03_dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import board.a04_vo.Board;

// board.a03_dao.Dao
public interface BoardDao {
	public List<Board> getBoardList(Board sch);
}
