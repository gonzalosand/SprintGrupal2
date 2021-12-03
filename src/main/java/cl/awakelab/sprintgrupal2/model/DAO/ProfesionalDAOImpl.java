package cl.awakelab.sprintgrupal2.model.DAO;

import cl.awakelab.sprintgrupal2.model.Conexion;
import cl.awakelab.sprintgrupal2.model.Profesional;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProfesionalDAOImpl implements IProfesionalDAO{

    private Connection cn = null;

    @Override
    public void create(Profesional p) {
        String sql = "INSERT INTO proyecto_grupal.profesional (titulo, fechaIngreso) VALUES ('"
                + p.getTitulo() + "','" + p.getFechaIngreso() + "');";

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
    public List<Profesional> readCap() {

        String sql = "select titulo, fechaIngreso from profesional ";
        ArrayList<Profesional> pro = new ArrayList<Profesional>();

        try {
            cn = Conexion.getConn();
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                pro.add(new Profesional(rs.getString("titulo"), rs.getString("fechaIngreso")));
            }
            stm.execute(sql);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pro;
    }

    @Override
    public Profesional readOne(int idProfesional) {
        return null;
    }

    @Override
    public void update(Profesional p) {
        String sql = "update proyecto_grupal.profesional set titulo = '" + p.getTitulo() +
                "', fechaIngreso = '" + p.getFechaIngreso() + "' where idproductos = '"+
                p.getId() +"'";

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
    public void delete(int id) {
        String sql = "delete from profesional where id = '" + id + "'";
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
    public void delete(Profesional p) {

    }
}
