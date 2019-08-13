package ownerService.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.model.vo.Emp;
import empService.model.vo.Resume;
import owner.model.vo.Owner;
import ownerService.model.service.IncruitService;

/**
 * Servlet implementation class SearchResumeListServlet
 */
@WebServlet("/SearchResumeListServlet")
public class SearchResumeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchResumeListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String str = request.getParameter("");
		
		필터vo 필터객체 = new 필터vo(컬럼컬럼);
		

		ArrayList<Resume> list = new IncruitService().selectSearchResumeList(필터객체);
		
		request.setAttribute("manageEmpList", list); // 컬렉션 넘기는거는 게시판 배우고 나서 다시 보기
		
		request.getRequestDispatcher("/views/ownerService/ManageEmp.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
