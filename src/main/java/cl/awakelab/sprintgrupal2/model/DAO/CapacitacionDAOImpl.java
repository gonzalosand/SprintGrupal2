package cl.awakelab.sprintgrupal2.model.DAO;

import cl.awakelab.sprintgrupal2.model.Capacitacion;
import cl.awakelab.sprintgrupal2.model.Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class CapacitacionDAOImpl implements ICapacitacionDAO {

	private Connection cn = null;

	public void create(Capacitacion c) {
		String sql = "INSERT INTO proyecto_grupal.capacitacion (rut_cliente, dia, hora, lugar, duracion, cantidad_asistentes) VALUES ('"
				+ c.getRutCliente() + "','" + c.getDia() + "','" + c.getHora() + "','" + c.getLugar()
				+ "','" + c.getDuracion() + "','" + c.getCantAsist()+ "')";

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
	public List<Capacitacion> readCap() {
	
		String sql = "select id, rut_cliente, dia, hora, lugar, duracion, cantidad_asistentes from capacitacion ";
		ArrayList<Capacitacion> cap = new ArrayList<Capacitacion>();
		
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				cap.add(new Capacitacion(rs.getInt("id"), rs.getInt("rut_cliente"), rs.getString("dia"), rs.getString("hora"), rs.getString("lugar"), rs.getString("duracion"), rs.getInt("cantidad_asistentes")));
			}
			stm.execute(sql);
			stm.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return cap;
	}
	


	@Override
	public Capacitacion readOne(int id) {
		String sql = "select id, rut_cliente, dia, hora, lugar, duracion, cantidad_asistentes from capacitacion where id = " + id;
		Capacitacion c = null;
		
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				c = new Capacitacion(rs.getInt("id"), rs.getInt("rut_capacitacion"), rs.getString("dia"), rs.getString("hora"), rs.getString("lugar"), rs.getString("duracion"), rs.getInt("cantidad_asistentes"));
			}
			
			rs.close();
			stm.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return c;
	}

	@Override
	public void update(Capacitacion c) {
		String sql= "update proyecto_grupal.capacitacion set rut_cliente = '" + c.getRutCliente() + "', dia = '" + c.getDia() + "', hora = '" + c.getHora() + "', lugar ='" + c.getLugar()
				+ "', duracion = '" + c.getDuracion() + "', cantidad_asistentes = '" + c.getCantAsist()+"' where id = '"+ c.getId() +"'";

		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
		}catch(SQLException e){

			e.printStackTrace();

		}
	}


	@Override
	public void delete(int id) {
		String sql = "delete from capacitacion where id = '" + id + "'";
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
	public void delete(Capacitacion c) {
		// TODO Auto-generated method stub

	}

}
