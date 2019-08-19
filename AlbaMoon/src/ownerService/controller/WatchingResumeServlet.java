package ownerService.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import empService.model.vo.Resume;
import owner.model.vo.Owner;
import ownerService.model.service.IncruitService;

/**
 * Servlet implementation class WatchingResumeServlet
 */
@WebServlet("/watchingResume.os")
public class WatchingResumeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WatchingResumeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rNum = (int)request.getAttribute("rNum");
		
		Resume resume = new IncruitService().selectResume(rNum);
		int result = new IncruitService().checkResume(rNum);
		
		request.setAttribute("resume", resume);
		
		
		request.getRequestDispatcher("/views/ownerService/WatchingResume.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
