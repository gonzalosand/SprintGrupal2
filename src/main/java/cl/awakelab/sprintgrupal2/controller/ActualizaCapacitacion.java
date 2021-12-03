package cl.awakelab.sprintgrupal2.controller;



import cl.awakelab.sprintgrupal2.model.Capacitacion;
import cl.awakelab.sprintgrupal2.model.DAO.CapacitacionDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet("/ActualizaCapacitacion")
public class ActualizaCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ActualizaCapacitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {



		getServletContext().getRequestDispatcher("/views/actualizaCapacitacion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		CapacitacionDAOImpl cDAO = new CapacitacionDAOImpl();
		Capacitacion c = new Capacitacion(Integer.parseInt(request.getParameter("id")),
				Integer.parseInt(request.getParameter("rutCliente")),
				request.getParameter("dia"),
				request.getParameter("hora"),
				request.getParameter("lugar"),
				request.getParameter("duracion"),
				Integer.parseInt(request.getParameter("cantAsist")));
		cDAO.update(c);

		response.sendRedirect("ListarCapacitacion");

	}

}
