package jspexp.a02_mvc.a01_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A00_Servlet
 */
@WebServlet(name = "servlet.do", urlPatterns = { "/servlet.do" })
public class A00_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A00_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//# 요청
		//	1. url주소로 특정한 화면을 요청하는 것(jsp, /servlet.do)
		//	2. 요청 key/value 형태의 데이터 처리
		//		HttpServletRequest request : request.getParameter("id")
		//# 반응
		//	1. 요청에 의해서 반응으로 화면을 client에 전달(html)하거나 json데이터를 전달
		//# 브라우저에서는 반응으로 온 html내용을 랜더링하여 화면에 출력한다.
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; cahrset=utf-8");
		PrintWriter out = response.getWriter();
		//jsp는 이 중에서 출력 부분만 뽑아서 html 만들어서 처리하는 것을 말한다.
		//<% %>로 선언한 부분은 자바로 선언되어서 처리되는 부분이다.
		String name = "홍길동";
		out.print("<html><body><h1>"+name+"</h1></html>");
	}

}
