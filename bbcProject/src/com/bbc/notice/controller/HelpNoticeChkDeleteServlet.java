package com.bbc.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbc.notice.model.service.NoticeService;
import com.google.gson.Gson;

/**
 * Servlet implementation class HelpNoticeChkDeleteServlet
 */
@WebServlet("/chkDelete.b.no")
public class HelpNoticeChkDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelpNoticeChkDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] arr = request.getParameterValues("arr");
		
		int result = new NoticeService().branchDeleteChkNotice(arr);
		
		if(result > 0) {
			response.setContentType("application/json; charset=utf-8");
			
			Gson gson = new Gson();
			gson.toJson(result, response.getWriter());
		} else {
			request.getRequestDispatcher("views/branch/common/errorPage.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
