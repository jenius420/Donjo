package empService.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import emp.model.vo.Emp;
import empService.model.service.ResumeService;
import empService.model.vo.Resume;

/**
 * Servlet implementation class ResumeServlet
 */
@WebServlet("/resume.es")
public class SubmitResumeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubmitResumeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		Emp emp = (Emp)request.getSession().getAttribute("user");
		
		String resumeTitle = request.getParameter("resumeTitle");
		int empNum = emp.getEmpNum();
		String district = request.getParameter("district");
		String type = request.getParameter("type");
		String picture = request.getParameter("type");
		String edu = request.getParameter("edu");
		String desireForm = request.getParameter("desireForm");
		int desireIncome = Integer.parseInt(request.getParameter("desireIncome"));
		String comment = request.getParameter("comment");
		String openSet = (request.getParameter("openSet")=="Y") ? "Y":"N";
		
		Resume resume = new Resume(resumeTitle, empNum, district, type, comment, picture, desireForm, desireIncome, openSet, edu);
		
		int result = new ResumeService().enrollResume(resume);
		
		if(result > 0) {
			request.setAttribute("msg", "이력서를 성공적으로 등록했습니다");	
			//response.sendRedirect("manageResume.es"); 이런식으로 서블렛을 바로 부를 수도 있고
			//response.sendRedirect("manageResume.es?empNum="+empNum); 해당서블렛에서 사용될 변수가 있으면 이렇게 추가하면 됨
		}else {
			request.setAttribute("msg", "이력서 등록에 실패했습니다. 다시 시도해주세요");
		}
		
		RequestDispatcher view = request.getRequestDispatcher("views/empService/ManageResume.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
