package cl.awakelab.sprintgrupal2.model.DAO;



import cl.awakelab.sprintgrupal2.model.Usuario;

import java.util.List;

public interface IUsuarioDAO {

    public List<Usuario> readUser();
    public void create(Usuario u);
    public void delete(int run);
}
