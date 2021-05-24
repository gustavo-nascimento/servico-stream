/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico_stream;

/**
 *
 * @author Gustavo
 */
public class Funcionario extends Usuario{
    private String serie_ctps;
    private double salario;

    public Funcionario(String codigo, String nome, String serie_ctps, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.serie_ctps = serie_ctps;
        this.salario = salario;
    }

    public String getSerie_ctps() {
        return serie_ctps;
    }

    public void setSerie_ctps(String serie_ctps) {
        this.serie_ctps = serie_ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
