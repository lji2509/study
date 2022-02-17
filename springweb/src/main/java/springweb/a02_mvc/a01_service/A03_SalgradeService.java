package springweb.a02_mvc.a01_service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a02_mvc.a03_dao.A03_SalgradeDao;
import springweb.vo.Salgrade2;

@Service
public class A03_SalgradeService {
	@Autowired
	private A03_SalgradeDao dao;
	
	public ArrayList<Salgrade2> getSalList() {
		System.out.println(dao.getSalList());
		return dao.getSalList();
	}
}
