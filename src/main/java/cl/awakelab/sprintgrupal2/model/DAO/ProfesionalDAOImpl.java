package cl.awakelab.sprintgrupal2.model.DAO;

import cl.awakelab.sprintgrupal2.model.Conexion;
import cl.awakelab.sprintgrupal2.model.Profesional;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
        return null;
    }

    @Override
    public Profesional readOne(int idProfesional) {
        return null;
    }

    @Override
    public void update(Profesional p) {

    }

    @Override
    public void delete(int idProfesional) {

    }

    @Override
    public void delete(Profesional p) {

    }
}
