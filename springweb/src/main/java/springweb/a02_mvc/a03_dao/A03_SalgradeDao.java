package springweb.a02_mvc.a03_dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.vo.Salgrade;
import springweb.vo.Salgrade2;

@Repository
public interface A03_SalgradeDao {
	public Salgrade getSalgrade(int grade);
	public ArrayList<Salgrade2> getSalList();
}
