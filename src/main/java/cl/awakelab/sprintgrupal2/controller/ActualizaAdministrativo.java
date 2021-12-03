package cl.awakelab.sprintgrupal2.controller;

import cl.awakelab.sprintgrupal2.model.Administrativo;
import cl.awakelab.sprintgrupal2.model.Capacitacion;
import cl.awakelab.sprintgrupal2.model.DAO.AdministrativoDAOImpl;
import cl.awakelab.sprintgrupal2.model.DAO.CapacitacionDAOImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/ActualizaAdministrativo")
public class ActualizaAdministrativo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdministrativoDAOImpl aDAO = new AdministrativoDAOImpl();
        Administrativo a = new Administrativo(Integer.parseInt(request.getParameter("id")),
                request.getParameter("area"),
                request.getParameter("experiencia"));
        aDAO.update(a);

        response.sendRedirect("ListarAdministrativo");

    }
}
