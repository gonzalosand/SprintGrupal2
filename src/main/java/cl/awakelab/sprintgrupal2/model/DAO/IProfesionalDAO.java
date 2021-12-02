package cl.awakelab.sprintgrupal2.model.DAO;


import cl.awakelab.sprintgrupal2.model.Profesional;

import java.util.List;

public interface IProfesionalDAO {

    public void create(Profesional p);
    public List<Profesional> readCap();
    public Profesional readOne(int idProfesional);
    public void update(Profesional p);
    public void delete(int idProfesional);
    public void delete(Profesional p);
}
