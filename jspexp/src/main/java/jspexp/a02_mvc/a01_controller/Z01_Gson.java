package jspexp.a02_mvc.a01_controller;

import java.util.ArrayList;

import com.google.gson.Gson;

import jspexp.a03_database.A01_Dao;
import jspexp.z01_vo.Dept;
import jspexp.z01_vo.Emp;
import jspexp.z01_vo.Person;
import jspexp.z01_vo.Product;

public class Z01_Gson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍길동", 25, "서울신림동");
		//1. Gson 객체 생성
		Gson gson = new Gson();
		//2. 기능메서드를 통해서 json 문자열 가져오기
		String personJson = gson.toJson(p1);
		//3. 확인
		System.out.println(personJson);
		
		Product p2 = new Product("사과", 5000, 4);
		String productjson = gson.toJson(p2);
		System.out.println(productjson);
		
		ArrayList<Product> plist = new ArrayList<Product>();
		plist.add(new Product("사과", 5000, 4));
		plist.add(new Product("바나나", 4000, 3));
		plist.add(new Product("딸기", 12000, 5));
		/*
		{} ==> []
		배열안에 객체 ==> [{},{},{}]
		[
			{name:"사과",price:3000,cnt:2},
			{name:"사과",price:3000,cnt:2},
			{name:"사과",price:3000,cnt:2}		
		]
		*/
		String listJson = gson.toJson(plist);
		System.out.println(listJson);
		
		ArrayList<Emp> elist = new ArrayList<Emp>();
		elist.add(new Emp(7000, "홍길동", "사원", 7499, "2022-01-17", 3400, 200, 30));
		elist.add(new Emp(8000, "김길동", "대리", 7689, "2022-01-17", 4300, 300, 30));
		elist.add(new Emp(9000, "이길동", "과장", 7888, "2022-01-17", 5200, 400, 30));
		String elistJson = gson.toJson(elist);
		System.out.println(elistJson);
		
		A01_Dao dao = new A01_Dao();
		ArrayList<Emp> dbEmplist = dao.empListPre("", "");
		String dbEmpJson = gson.toJson(dbEmplist);
		System.out.println(dbEmpJson);
		
		ArrayList<Dept> dbDeptlist = dao.deptList("");
		String dbDeptJson = gson.toJson(dbDeptlist);
		System.out.println(gson.toJson(dbDeptlist));
	}

}
