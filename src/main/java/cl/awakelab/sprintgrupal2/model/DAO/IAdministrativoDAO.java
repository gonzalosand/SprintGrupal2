package cl.awakelab.sprintgrupal2.model.DAO;

import cl.awakelab.sprintgrupal2.model.Administrativo;

import java.util.List;

public interface IAdministrativoDAO {

    public void create(Administrativo a);
    public List<Administrativo> readAdmi();
    public void update(Administrativo a);
    public void delete(int id);
    public void delete(Administrativo a);
}
