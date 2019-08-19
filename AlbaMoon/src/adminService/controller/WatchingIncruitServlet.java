package adminService.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adminService.model.service.ManageIncruitService;
import ownerService.model.vo.Incruit;

/**
 * Servlet implementation class WatchingIncruitServlet
 */
@WebServlet("/watchingIncruit.as")
public class WatchingIncruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WatchingIncruitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int wNum = Integer.parseInt(request.getParameter("wNum"));
		
		Incruit incruit = new ManageIncruitService().watchingIncruit(wNum);
		
		request.setAttribute("incruit", incruit);
		
		request.getRequestDispatcher("/views/adminService/WatchingIncruit.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
