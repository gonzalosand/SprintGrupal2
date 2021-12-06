package cl.awakelab.sprintgrupal2.controller;



import cl.awakelab.sprintgrupal2.model.Capacitacion;
import cl.awakelab.sprintgrupal2.model.DAO.CapacitacionDAOImpl;
import cl.awakelab.sprintgrupal2.model.DAO.ProfesionalDAOImpl;
import cl.awakelab.sprintgrupal2.model.DAO.UsuarioDAOImpl;
import cl.awakelab.sprintgrupal2.model.Profesional;
import cl.awakelab.sprintgrupal2.model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet("/ActualizaProfesional")
public class ActualizaProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ActualizaProfesional() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {



		getServletContext().getRequestDispatcher("/views/actualizaProfesional.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UsuarioDAOImpl uDAO = new UsuarioDAOImpl();
		ProfesionalDAOImpl pDAO = new ProfesionalDAOImpl();

		Profesional p = new Profesional(request.getParameter("titulo"),
				request.getParameter("fechaIngreso"));

		Usuario u = new Usuario(Integer.parseInt(request.getParameter("run")),
				request.getParameter("nombre"),
				request.getParameter("fechaNac"),
				request.getParameter("tipo"));


		pDAO.update(p);
		uDAO.update(u);

		response.sendRedirect("ListarCapacitacion");

	}

}
