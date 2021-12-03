package cl.awakelab.sprintgrupal2.model.DAO;

import cl.awakelab.sprintgrupal2.model.Administrativo;
import cl.awakelab.sprintgrupal2.model.Conexion;
import cl.awakelab.sprintgrupal2.model.Profesional;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdministrativoDAOImpl implements IAdministrativoDAO {

    private Connection cn = null;

    @Override
    public void create(Administrativo a)  {
        String sql = "INSERT INTO proyecto_grupal.administrativo (area, experiencia) VALUES ('"
                + a.getArea() + "','" + a.getExperiencia() + "');";

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
    public List<Administrativo> readAdmi() {
        String sql = "select area, experiencia from administrativo ";
        ArrayList<Administrativo> adm = new ArrayList<Administrativo>();

        try {
            cn = Conexion.getConn();
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                adm.add(new Administrativo(rs.getString("area"), rs.getString("experiencia")));
            }
            stm.execute(sql);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adm;
    }

    @Override
    public void update(Administrativo a) {
        String sql = "update proyecto_grupal.administrativo set area = '" + a.getArea() +
                "', experiencia = '" + a.getExperiencia() + "' where id= '"+
                a.getId() +"'";

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
        String sql = "delete from administrativo where id = '" + id + "'";
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
    public void delete(Administrativo administrativo) {

    }
}
