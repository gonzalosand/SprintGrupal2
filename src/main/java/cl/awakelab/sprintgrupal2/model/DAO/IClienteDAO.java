package cl.awakelab.sprintgrupal2.model.DAO;

import cl.awakelab.sprintgrupal2.model.Administrativo;
import cl.awakelab.sprintgrupal2.model.Cliente;

import java.util.List;

public interface IClienteDAO {

    public void create(Cliente cli);
    public List<Cliente> readcli();
    public void update(Cliente cli);
    public void delete(int idCliente);
    public void delete(Cliente cli);
}
