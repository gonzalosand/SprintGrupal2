package cl.awakelab.sprintgrupal2.model.DAO;

import cl.awakelab.sprintgrupal2.model.Capacitacion;

import java.util.List;






public interface ICapacitacionDAO {
	
	public void create(Capacitacion c);
	public List<Capacitacion> readCap();
	public Capacitacion readOne(int id);
	public void update(Capacitacion c);
	public void delete(int id);
	public void delete(Capacitacion c);

}
