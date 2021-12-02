package cl.awakelab.sprintgrupal2.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password  = request.getParameter("password");
		
		if (username.equalsIgnoreCase("admin") && (password.equalsIgnoreCase("1234")))
				{
			getServletContext().getRequestDispatcher("/views/inicio.jsp").forward(request, response);
	   	}
		
		
		else {
			
	 /* 	PrintWriter salida;
			response.setContentType("text/html");
			salida = response.getWriter();
			salida.println("<html lang='es'><head><meta charset='URF-8'><title>Eeste es un mensaje</title><head><body>");
			salida.println("<h1> Datos incorrectos </h1>");
			salida.println("</body></html>");	
			salida.close(); */
			
			getServletContext().getRequestDispatcher("/Views/login.jsp").forward(request, response);
		}
		
	
	
	}

}

