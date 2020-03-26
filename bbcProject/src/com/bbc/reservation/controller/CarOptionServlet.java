package com.bbc.reservation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CarOptionServlet
 */
@WebServlet("/rvCarOption.rv")
public class CarOptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarOptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("rvCarOption.rv 수행");
		
		String rent_branch = request.getParameter("rent_branch");
		String return_branch = request.getParameter("return_branch");
		String rent_branchnm = request.getParameter("rent_branchnm");
		String return_branchnm = request.getParameter("return_branchnm");
		String rentDate = request.getParameter("rentDate");
		String returnDate = request.getParameter("returnDate");
		String carname = request.getParameter("carname");
		String carimg = request.getParameter("carimg");
		String carpay = request.getParameter("carpay");
		int carno = Integer.parseInt(request.getParameter("carno"));		
		
		System.out.println(rent_branch);
		System.out.println(return_branch);
		System.out.println(rent_branchnm);
		System.out.println(return_branchnm);
		System.out.println(rentDate);
		System.out.println(returnDate);		
		System.out.println(carname);	
		System.out.println(carimg);	
		System.out.println(carpay);	
		System.out.println(carno);	
		
		// 응답데이터를 요청했을 때의 해당 페이지에 다시 전달
		response.setCharacterEncoding("utf-8");
		
		request.setAttribute("parentMenu", "차량예약^차량선택");
		request.setAttribute("currentMenu", "옵션선택");		
		request.getRequestDispatcher("views/reservation/reservationOption1.jsp").forward(request, response);
		
		
		//PrintWriter out = response.getWriter();
		//out.print(request);
		
		/*
		request.setAttribute("parentMenu", "차량예약^차량선택");
		request.setAttribute("currentMenu", "옵션선택");		
		request.getRequestDispatcher("views/reservation/reservationOption1.jsp").forward(request, response);
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
