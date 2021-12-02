package cl.awakelab.sprintgrupal2.controller;

import cl.awakelab.sprintgrupal2.model.Administrativo;
import cl.awakelab.sprintgrupal2.model.Cliente;
import cl.awakelab.sprintgrupal2.model.DAO.AdministrativoDAOImpl;
import cl.awakelab.sprintgrupal2.model.DAO.ClienteDAOImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/CrearCliente")
public class CrearCliente extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/views/crearCliente.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ClienteDAOImpl clienteDAO = new ClienteDAOImpl();
        Cliente cli = new Cliente(request.getParameter("nombres"),
                request.getParameter("apellidos"),request.getParameter("telefono"),
                request.getParameter("afp"),request.getParameter("sistemaSalud"),
                request.getParameter("direccion"),request.getParameter("comuna"),
                Integer.parseInt(request.getParameter("edad")));

        clienteDAO.create(cli);

        request.getRequestDispatcher("/views/crearCliente.jsp").forward(request, response);

    }
}
