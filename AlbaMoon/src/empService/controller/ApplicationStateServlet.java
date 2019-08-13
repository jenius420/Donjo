package empService.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.model.vo.Emp;
import empService.model.service.EmpServiceService;
import empService.model.vo.ApplicationState;

/**
 * Servlet implementation class ApplicationStateServlet
 */
@WebServlet("/applicationState.es")
public class ApplicationStateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationStateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
//		지원자모음 테이블에서 세션유저 id로 매칭되는 row들을 모아옴
		Emp emp = (Emp)request.getSession().getAttribute("emp");
		ArrayList<ApplicationState> list = new EmpServiceService().selectApplicationState(emp.getEmpNum());
		
		if(list.size() > 0) {
			request.setAttribute("applicationStatelist", list);
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/views/empService/ApplicationState.jsp");
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
