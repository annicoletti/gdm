/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.List;
import model.Cliente;

/**
 *
 * @author Deibidson Mesquita
 */
public interface ClienteInterface {

    public void salvaCliente(Cliente p);

    public Cliente clientePorCodigo(long codigo);

    public void deleteCliente(Cliente p);

    public List<Cliente> listaTodosClientes();

    public Cliente clientePorCpf(String cpf);

}
