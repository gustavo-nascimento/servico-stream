/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico_stream;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class ServicoStream {
    private ArrayList<Filme> filmes;
    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;

    public ServicoStream(ArrayList<Filme> filmes, ArrayList<Cliente> clientes, ArrayList<Funcionario> funcionarios) {
        this.filmes = filmes;
        this.clientes = clientes;
        this.funcionarios = funcionarios;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public ArrayList<Filme> filmePorTitulo(String titulo){
        ArrayList<Filme> filme_por_titulo = new ArrayList();
        for(int i = 0; i < this.filmes.size(); i++){
            if(titulo.equals(this.filmes.get(i).getTitulo())){
                filme_por_titulo.add(this.filmes.get(i));
            }
        }
        return filme_por_titulo;
    }
    
    public ArrayList<Filme> filmesPorAno(int ano){
        ArrayList<Filme> filmes_por_ano = new ArrayList();
        for(int i = 0; i < this.filmes.size(); i++){
            if(this.filmes.get(i).getAno() == ano){
                filmes_por_ano.add(this.filmes.get(i));
            }
        }
        return filmes_por_ano;
    }
    
    public ArrayList<Filme> filmesPorDiretor(String diretor){
        ArrayList<Filme> filmes_por_diretor = new ArrayList();
        for(int i = 0; i < this.filmes.size(); i++){
            if(this.filmes.get(i).getDiretor() == diretor){
                filmes_por_diretor.add(this.filmes.get(i));
            }
        }
        return filmes_por_diretor;
    }
    
    public ArrayList<Filme> filmesPorAtor(String ator){
        ArrayList<Filme> filmes_por_ator = new ArrayList();
        for(int i = 0; i < this.filmes.size(); i++){
            for(int j = 0; j < this.filmes.get(i).getAtores().length; j++){
                if(this.filmes.get(i).getAtores()[j] == ator){
                    filmes_por_ator.add(this.filmes.get(i));
                }
            }
        }
        return filmes_por_ator;
    }
    
    public ArrayList<Filme> filmesPorGenero(String genero){
        ArrayList<Filme> filmes_por_genero = new ArrayList();
        for(int i = 0; i < this.filmes.size(); i++){
            for(int j = 0; j < this.filmes.get(i).getGeneros().length; j++){
                if(this.filmes.get(i).getGeneros()[j] == genero){
                    filmes_por_genero.add(this.filmes.get(i));
                }
            }
        }
        return filmes_por_genero;
    }
}
