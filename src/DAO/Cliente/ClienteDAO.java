/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Cliente;

import servico_stream.Cliente;

/**
 *
 * @author Gustavo
 */
public interface ClienteDAO {
    public void cadastrarCliente(Cliente c);
    public void mostrarCliente(String codigo);
    public void editarCliente(Cliente c);
    public void excluirCliente(String codigo);
    public void mostrarTodosOsCliente();
}
