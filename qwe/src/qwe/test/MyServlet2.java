package qwe.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Teacher;

/**
 * Servlet implementation class MyServlet2
 */
@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private int i = 0;
	private List list = new ArrayList();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Enumeration<String> attributeNames = request.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String string = (String) attributeNames.nextElement();
			System.out.println(string);
			
		}
		if (!request.getRemoteAddr().equals(request.getLocalAddr())) {
			System.out.println("++");
			list.add(request.getRemoteAddr());
			i++;
			System.out.println(i);
		}
		System.out.println(list);
		
		String remoteAddr = request.getRemoteAddr();
		String localAddr = request.getLocalAddr();
		System.out.println(remoteAddr);
		request.getRequestDispatcher("/MyServlet3").forward(request, response);;
		System.out.println(localAddr);
		String[] parameterValues = request.getParameterValues("teacher");
		Teacher teacher = new Teacher();
		teacher.setName(parameterValues[0]);
		teacher.setGender(parameterValues[2]);
		request.setAttribute("shit", teacher);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
