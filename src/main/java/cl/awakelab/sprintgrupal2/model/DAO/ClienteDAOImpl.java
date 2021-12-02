package cl.awakelab.sprintgrupal2.model.DAO;

import cl.awakelab.sprintgrupal2.model.Cliente;
import cl.awakelab.sprintgrupal2.model.Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ClienteDAOImpl implements IClienteDAO{

    private Connection cn = null;


    @Override
    public void create(Cliente cli) {
        String sql = "INSERT INTO proyecto_grupal.cliente (nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad VALUES ('"
                + cli.getNombres() + "','" + cli.getApellidos() + "','" +cli.getTelefono()+ "','"+ cli.getAfp()+ "','"
                + cli.getSistemaSalud() + "','" + cli.getDireccion() + "','" + cli.getComuna() + "','"
                + cli.getEdad() + "');";

        try {

            cn= Conexion.getConn();
            Statement stm = cn.createStatement();
            stm.execute(sql);
            stm.close();

        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Cliente> readcli() {
        return null;
    }

    @Override
    public void update(Cliente cli) {

    }

    @Override
    public void delete(int idCliente) {

    }

    @Override
    public void delete(Cliente cli) {

    }
}
