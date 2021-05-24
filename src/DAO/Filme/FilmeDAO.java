/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Filme;

import servico_stream.Filme;

/**
 *
 * @author Gustavo
 */
public interface FilmeDAO {
    public void cadastrarFilme(Filme f);
    public void mostrarFilme(String codigo);
    public void editarFilme(Filme f);
    public void excluirFilme(String codigo);
    public void mostrarTodosOsFilmes();
}
