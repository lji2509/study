package jspexp.a02_mvc.a01_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import jspexp.a04_member.Member_DAO;
import jspexp.a04_member.Member_VO;

/**
 * Servlet implementation class A12_CheckIdCtrl
 */
@WebServlet(name = "checkId.do", urlPatterns = { "/checkId.do" })
public class A11_CheckIdCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A11_CheckIdCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1. 요청값
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id"); if(id==null) id=""; //null예외 방지
		
		//2. DAO연결, id가 있는지 확인
		Member_DAO dao = new Member_DAO();
		Member_VO m = dao.getMember(id);
		
		// 3. 전달할 keyword, json
		PrintWriter out = response.getWriter();
		//요청값이 있고, 검색한 id로 데이터가 없을 때
		if(!id.equals("") && m==null) {
			out.print("Y"); //데이터 없을 때, 유효하다고 Y를 client에 전달
		} else {
			out.print("N"); //데이터가 있을 때, 유효하지 않다고 N을 client에 전달
		}
	}

}
