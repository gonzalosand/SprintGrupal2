package cl.awakelab.sprintgrupal2.controller;

import cl.awakelab.sprintgrupal2.model.DAO.UsuarioDAOImpl;
import cl.awakelab.sprintgrupal2.model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/CrearUsuario")
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CrearUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/views/crearUsuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tipo = request.getParameter("tipo");
		/*UsuarioDAOImpl uDAO = new UsuarioDAOImpl();
		Usuario u = new Usuario(Integer.parseInt(request.getParameter("run")),
				request.getParameter("nombre"),
				request.getParameter("fechaNac"),
				request.getParameter("tipo"));



		uDAO.create(u);

*/
	if(tipo.equalsIgnoreCase("administrativo")){
		getServletContext().getRequestDispatcher("/views/crearAdministrativo.jsp").forward(request, response);

	}if(tipo.equalsIgnoreCase("profesional")){
			getServletContext().getRequestDispatcher("/views/crearProfesional.jsp").forward(request, response);

		}if(tipo.equalsIgnoreCase( "cliente")) {
			getServletContext().getRequestDispatcher("/views/crearCliente.jsp").forward(request, response);

		}

	}

}
