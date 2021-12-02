package cl.awakelab.sprintgrupal2.model.DAO;

import cl.awakelab.sprintgrupal2.model.Cliente;
import cl.awakelab.sprintgrupal2.model.Conexion;
import cl.awakelab.sprintgrupal2.model.Profesional;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
        String sql = "select nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad from cliente ";
        ArrayList<Cliente> cli = new ArrayList<Cliente>();

        try {
            cn = Conexion.getConn();
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                cli.add(new Cliente(rs.getString("nombres"), rs.getString("apellidos"), rs.getString("telefono"), rs.getString("afp"), rs.getString("sistemaSalud"), rs.getString("direccion"), rs.getString("comuna"), rs.getInt("edad")));
            }
            stm.execute(sql);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cli;
    }
    @Override
    public void update(Cliente cli) {

    }

    @Override
    public void delete(int id) {
        String sql = "delete from cliente where id = '" + id + "'";
        try {
            cn = Conexion.getConn();
            Statement stm = cn.createStatement();
            stm.execute(sql);
            stm.close();
        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
    @Override
    public void delete(Cliente cli) {

    }
}
