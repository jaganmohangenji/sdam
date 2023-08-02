package serverprog;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Details.ModelForREgistration;
import stdMode.modelImp;

/**
 * Servlet implementation class JaganServer
 */
@WebServlet("/JaganServer")
public class JaganServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JaganServer() {
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
		String eMail=request.getParameter("email");
		String Address=request.getParameter("Address");
		String gender=request.getParameter("gender");
		String nationality=request.getParameter("nationality");
		String[] progr=request.getParameterValues("program");
		String program=Arrays.toString(progr);
		String[] languagesKnown = request.getParameterValues("program");
		//String custmLang = Arrays.stream(languagesKnown).map(s -> s).collect(Collectors.joining(","));
		String custmLang=Arrays.toString(languagesKnown);
		ModelForREgistration m=new ModelForREgistration(name, eMail, Address, gender, custmLang);
		modelImp m1=new modelImp();
		int result=m1.getdetails(m);
		PrintWriter out=response.getWriter();
		if(result==1)
		{
			out.println("Registered sucessfully!!");
			out.println("<head><body><h1>welcome "+m.getName());
			
			//out.println("<head><body><h1>welcome "+m.getProgramSkills());
			RequestDispatcher rd = request.getRequestDispatcher("/LogInpage.html");
			rd.include(request, response);
			out.println("</body></head>");
			
		}
		else
		{
			out.println("plese enter correct one for registration");
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
