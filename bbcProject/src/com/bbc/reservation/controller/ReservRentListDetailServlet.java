package com.bbc.reservation.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbc.payment.model.vo.Payment;
import com.bbc.reservation.model.service.ReservationService;
import com.bbc.userInfo.model.vo.UserInfo;

/**
 * Servlet implementation class ReservRentListDetailServlet
 */
@WebServlet("/detailRent.b.rv")
public class ReservRentListDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservRentListDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("no"));
		
		UserInfo ui = new ReservationService().selectRentDetailMember(no);
		Payment p = new ReservationService().selectRentDetailPay(no);
		
		request.setAttribute("ui", ui);
		request.setAttribute("p", p);
		
		request.getRequestDispatcher("views/branch/reservmanagement/rentListDetail.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
