package cl.awakelab.sprintgrupal2.controller;

import cl.awakelab.sprintgrupal2.model.Capacitacion;
import cl.awakelab.sprintgrupal2.model.DAO.CapacitacionDAOImpl;
import cl.awakelab.sprintgrupal2.model.DAO.ProfesionalDAOImpl;
import cl.awakelab.sprintgrupal2.model.DAO.UsuarioDAOImpl;
import cl.awakelab.sprintgrupal2.model.Profesional;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListarProfesional", value = "/ListarProfesional")
public class ListarProfesional extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ProfesionalDAOImpl pDAO = new ProfesionalDAOImpl();

        List<Profesional> pro = pDAO.readCap();

        request.setAttribute("pro", pro);

        getServletContext().getRequestDispatcher("/views/listarProfesional.jsp").forward(request, response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        ProfesionalDAOImpl eliminarDAO = new ProfesionalDAOImpl();

        eliminarDAO.delete(id);
        response.sendRedirect("ListarProfesional");
    }
}
