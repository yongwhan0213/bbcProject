package com.bbc.notice.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbc.common.PageInfo;
import com.bbc.notice.model.service.NoticeService;
import com.bbc.notice.model.vo.Notice;

/**
 * Servlet implementation class HelpNoticeListServlet
 */
@WebServlet("/notice.b.no")
public class HelpNoticeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelpNoticeListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PageInfo pi = new PageInfo();
		
		pi.setListCount(new NoticeService().getNoticeCount());
		
		pi.setCurrentPage(1);
		
		if(request.getParameter("currentPage") != null) {
			pi.setCurrentPage(Integer.parseInt(request.getParameter("currentPage")));
		}
		
		pi.setPageLimit(5);
		
		pi.setTableLimit(15);
		
		pi.setMaxPage((int)Math.ceil((double)pi.getListCount()/pi.getTableLimit()));
		
		pi.setStartPage((pi.getCurrentPage() - 1)/pi.getPageLimit() * pi.getPageLimit() + 1);
		
		pi.setEndPage(pi.getStartPage() + pi.getPageLimit() - 1);
		
		if(pi.getMaxPage() < pi.getEndPage()) {
			pi.setEndPage(pi.getMaxPage());
		}
		
		int memNo = 21;
		
		ArrayList<Notice> list = new NoticeService().selectNoticeList(memNo, pi);
		
		
		request.setAttribute("list", list);
		request.setAttribute("pi", pi);
		
		request.getRequestDispatcher("views/branch/helpcenter/notice.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
