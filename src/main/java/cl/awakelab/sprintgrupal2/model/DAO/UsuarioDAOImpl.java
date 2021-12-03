package cl.awakelab.sprintgrupal2.model.DAO;



import cl.awakelab.sprintgrupal2.model.Conexion;
import cl.awakelab.sprintgrupal2.model.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements IUsuarioDAO{

    private Connection cn = null;

    @Override
    public List<Usuario> readUser() {

        String sql = "select run, nombre, fecha_nacimiento, tipo from usuario ";
        ArrayList<Usuario> user = new ArrayList<Usuario>();

        try {
            cn = Conexion.getConn();
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while(rs.next()) {
                user.add(new Usuario(rs.getInt("run"), rs.getString("nombre"), rs.getString("fecha_nacimiento"), rs.getString("tipo")));
            }
            stm.execute(sql);
            stm.close();
        }catch(SQLException e){
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public void create(Usuario u) {
        String sql = "INSERT INTO proyecto_grupal.usuario (run, nombre, fecha_nacimiento, tipo) VALUES ('"
                + u.getRun() + "','" + u.getNombre() + "','" + u.getFechaNac() +  "','"  +u.getTipo()+"');";

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
    public void update(Usuario u) {
        String sql = "update proyecto_grupal.usuario set run = '" + u.getRun() +
                "', nombre = '" + u.getNombre() + "', fecha_nacimiento = '"+ u.getFechaNac()+ "', tipo = '" + u.getTipo() +"' where run = '"+
                u.getRun() +"'";

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
    public void delete(int run) {
    String sql = "delete from usuario where run = '"+run+"'";
		try {
        cn = Conexion.getConn();
        Statement stm = cn.createStatement();
        stm.execute(sql);
        stm.close();
    }catch(SQLException e){

        e.printStackTrace();

    }
}
}
