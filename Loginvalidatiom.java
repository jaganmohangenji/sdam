package serverprog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import stdMode.modelImp;

/**
 * Servlet implementation class Loginvalidatiom
 */
@WebServlet("/Loginvalidatiom")
public class Loginvalidatiom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginvalidatiom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		modelImp p=new modelImp();
		boolean res=p.loginvalidation(name, email);
		PrintWriter out=response.getWriter();
		if(res==true)
		{
			out.println("<h1>welcome to the page'"+name+"'</h1>");
			 //request.getRequestDispatcher("Welcome").include(request, response);
			
		}
		else
		{
			out.println("please enter valid userid or password");
			RequestDispatcher rsd=request.getRequestDispatcher("/LogInpage.html");
			rsd.include(request, response);
		
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
