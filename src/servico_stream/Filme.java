/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico_stream;
import servico_stream.Usuario;
import java.util.ArrayList;
/**
 *
 * @author Gustavo
 */

public class Filme{
    private String titulo;
    private int ano;
    private String diretor;
    private String atores[];
    private String generos[];
    private int n_visualizacoes;
    private double avaliacoes;
    private ArrayList<Usuario> usuarios_que_assistiram;

    public Filme(String titulo, int ano, String diretor, String[] atores, String[] generos, int n_visualizacoes, double avaliacoes) {
        this.titulo = titulo;
        this.ano = ano;
        this.diretor = diretor;
        this.atores = atores;
        this.generos = generos;
        this.n_visualizacoes = n_visualizacoes;
        this.avaliacoes = avaliacoes;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String[] getAtores() {
        return atores;
    }

    public void setAtores(String[] atores) {
        this.atores = atores;
    }

    public String[] getGeneros() {
        return generos;
    }

    public void setGeneros(String[] generos) {
        this.generos = generos;
    }

    public int getN_visualizacoes() {
        return n_visualizacoes;
    }

    public void setN_visualizacoes(int n_visualizacoes) {
        this.n_visualizacoes = n_visualizacoes;
    }

    public double getAvaliacoes() {
        return Math.round(avaliacoes* 100.0)/100.0;
    }

    public void setAvaliacoes(double avaliacoes) {
        this.avaliacoes = (avaliacoes + this.avaliacoes)/2;
    }   

    public ArrayList<Usuario> getUsuarios_que_assistiram() {
        if(this.usuarios_que_assistiram != null){
            return usuarios_que_assistiram;
        }else{
            return null;
        }
    }

    public void setUsuarios_que_assistiram(ArrayList<Usuario> usuarios_que_assistiram) {
        this.usuarios_que_assistiram = usuarios_que_assistiram;
    }
    
    public void assistido(Usuario usuario){
        this.n_visualizacoes += 1;
        this.usuarios_que_assistiram = new ArrayList();
        this.usuarios_que_assistiram.add(usuario);
    }
}
