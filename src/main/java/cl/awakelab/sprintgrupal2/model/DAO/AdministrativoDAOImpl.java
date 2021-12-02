package cl.awakelab.sprintgrupal2.model.DAO;

import cl.awakelab.sprintgrupal2.model.Administrativo;
import cl.awakelab.sprintgrupal2.model.Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
    public List<Administrativo> readCap() {
        return null;
    }


    @Override
    public void update(Administrativo a) {

    }

    @Override
    public void delete(int idAdministrativo) {

    }


    @Override
    public void delete(Administrativo administrativo) {

    }
}
