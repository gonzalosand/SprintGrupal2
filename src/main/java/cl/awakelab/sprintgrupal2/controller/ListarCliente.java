package cl.awakelab.sprintgrupal2.controller;

import cl.awakelab.sprintgrupal2.model.Cliente;
import cl.awakelab.sprintgrupal2.model.DAO.ClienteDAOImpl;
import cl.awakelab.sprintgrupal2.model.DAO.ProfesionalDAOImpl;
import cl.awakelab.sprintgrupal2.model.Profesional;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ListarCliente")
public class ListarCliente extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClienteDAOImpl cDAO = new ClienteDAOImpl();

        List<Cliente> cli = cDAO.readcli();

        request.setAttribute("cli", cli);

        getServletContext().getRequestDispatcher("/views/listarCliente.jsp").forward(request, response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        ClienteDAOImpl eliminarDAO = new ClienteDAOImpl();

        eliminarDAO.delete(id);
        getServletContext().getRequestDispatcher("/views/listarCliente.jsp").forward(request, response);

    }

}
