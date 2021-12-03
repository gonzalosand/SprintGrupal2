package cl.awakelab.sprintgrupal2.controller;

import cl.awakelab.sprintgrupal2.model.Administrativo;
import cl.awakelab.sprintgrupal2.model.DAO.AdministrativoDAOImpl;
import cl.awakelab.sprintgrupal2.model.DAO.ProfesionalDAOImpl;
import cl.awakelab.sprintgrupal2.model.Profesional;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/CrearAdministrativo")
public class CrearAdministrativo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/views/crearAdministrativo.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AdministrativoDAOImpl aDAO = new AdministrativoDAOImpl();
        Administrativo a = new Administrativo(request.getParameter("area"),
                request.getParameter("experiencia"));

        aDAO.create(a);

        request.getRequestDispatcher("/views/crearAdministrativo.jsp").forward(request, response);

    }
}
