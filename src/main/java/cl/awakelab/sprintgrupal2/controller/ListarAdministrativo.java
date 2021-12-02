package cl.awakelab.sprintgrupal2.controller;

import cl.awakelab.sprintgrupal2.model.Administrativo;
import cl.awakelab.sprintgrupal2.model.DAO.AdministrativoDAOImpl;
import cl.awakelab.sprintgrupal2.model.DAO.ProfesionalDAOImpl;
import cl.awakelab.sprintgrupal2.model.Profesional;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ListarAdministrativo")
public class ListarAdministrativo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdministrativoDAOImpl aDAO = new AdministrativoDAOImpl();

        List<Administrativo> adm = aDAO.readAdmi();

        request.setAttribute("adm", adm);

        getServletContext().getRequestDispatcher("/views/listarAdministrativo.jsp").forward(request, response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
