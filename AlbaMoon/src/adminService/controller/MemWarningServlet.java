package adminService.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adminService.model.service.ManageMemService;
import emp.model.vo.Emp;
import member.model.vo.PersonMember;
import owner.model.vo.Owner;

/**
 * Servlet implementation class MemWarningServlet
 */
@WebServlet("/memWarning.as")
public class MemWarningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemWarningServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Emp> empList = new ManageMemService().selectEmpList();
		ArrayList<Owner> ownerList = new ManageMemService().selectOwnerList();
		
		request.setAttribute("empList", empList);
		request.setAttribute("ownerList", ownerList);
		
		request.getRequestDispatcher("/views/empService/MemWarning.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
