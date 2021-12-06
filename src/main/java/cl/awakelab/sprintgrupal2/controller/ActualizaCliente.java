package cl.awakelab.sprintgrupal2.controller;



import cl.awakelab.sprintgrupal2.model.Cliente;
import cl.awakelab.sprintgrupal2.model.DAO.ClienteDAOImpl;
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
@WebServlet("/ActualizaCliente")
public class ActualizaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ActualizaCliente() {
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

		ClienteDAOImpl clienteDAO = new ClienteDAOImpl();
		Cliente cli = new Cliente(Integer.parseInt(request.getParameter("id")),
				request.getParameter("nombres"),
				request.getParameter("apellidos"),request.getParameter("telefono"),
				request.getParameter("afp"),request.getParameter("sistemaSalud"),
				request.getParameter("direccion"),request.getParameter("comuna"),
				Integer.parseInt(request.getParameter("edad")));

		clienteDAO.update(cli);

		response.sendRedirect("ListarCliente");

	}

}
