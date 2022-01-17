package jspexp.a02_mvc.a01_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A01_Controller
 */
@WebServlet(name = "ajaxMvc02.do", urlPatterns = { "/ajaxMvc02.do" })
public class A05_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A05_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1. 요청값 처리
		//	?name=himan&age=25&loc=서울
		request.setCharacterEncoding("utf-8");
		//	request.getParameter("key")
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		System.out.println("id : " + id);
		System.out.println("pass : " + pass);
		String result = "미인증";
		if(id!=null&&pass!=null) {
			if(id.equals("himan") && pass.equals("7777")) {
				result = "인증";
			}
		}
		//2. model 데이터 처리
		
		//3. view단 호출 처리
		//	1) out객체로 출력 처리
		//		response 객체는 client단에 전달하는 객체로 기능메서드 getWriter()를 통해서 화면을 출력하는 PrintWriter 객체를 리턴한다.
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		//출력할 내용의 한글 처리
		PrintWriter out = response.getWriter();
		//{"id":"id","pass":"pass","result":"result"}
		out.print("{\"id\":\""+id+"\",\"pass\":\""+pass+"\",\"result\":\""+result+"\"}");
//		out.print("hello!");
		
		//	2) jsp를 호출(연동)
		/*
		String page = "a01_begin\\a30_mvc01.jsp"; //이동할 경로와 jsp파일
		//요청객체와 반응객체와 함께 넘길 jsp페이지 호출
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
		*/
	}
}
