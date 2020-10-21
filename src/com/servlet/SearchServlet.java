//package com.servlet;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import com.bean.Page;
//import com.bean.Student;
//import com.dao.StudentDao;
//
///**
// * Servlet implementation class SearchServlet
// */
//@WebServlet("/SearchServlet")
//public class SearchServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public SearchServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		List<Student> list=null;
//		
//			StudentDao studentDao=new StudentDao();
//			list=studentDao.select();
//			session.setAttribute("students", list);
//		
//			list=(List<Student>)att;
//		
//		String pageS=request.getParameter("page");
//		Integer dpage=1;
//		if(pageS!=null) {
//			dpage=Integer.parseInt(pageS);
//		}
//		Page page=new Page();
//		page.setTotalcount(list.size());
//		page.setPagecount(10);
//		page.setTotalpage();
//		page.setDpage(dpage);
//		Integer end=dpage*10;
//		if(end>page.getTotalcount()) {
//			end=page.getTotalcount();
//		}
//		List<Student> subList=list.subList((dpage-1)*10, end);
//		request.setAttribute("studentList", subList);
//		request.setAttribute("page", page);
//		//request.setAttribute("studentList", list);
//		//response.sendRedirect("main.jsp");
//		request.getRequestDispatcher("main.jsp").forward(request, response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
