/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico_stream;
import servico_stream.Filme;
/**
 *
 * @author Gustavo
 */
public class Usuario {
    private String nome;
    private String metodo_pagamento;
    private boolean pago;

    public Usuario(String nome, String metodo_pagamento, boolean pago) {
        this.nome = nome;
        this.metodo_pagamento = metodo_pagamento;
        this.pago = pago;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    public void assiste_filme(Filme filme){
        if(this.pago == true){
            filme.assistido(this);
            
            System.out.println("O filme '"+filme.getTitulo()+"' foi assistido por: "+this.nome);
        }else{
            System.out.println("O usuário "+this.nome+" precisa pagar a mensalidade para asistir o filme");
        }
    }
    
    public void avalia_filme(Filme filme, double nota){
        boolean assistiu_o_filme = false;
        if(filme.getUsuarios_que_assistiram() != null){
            for(int i = 0; i < filme.getUsuarios_que_assistiram().size(); i++){
                if(this.nome.equals(filme.getUsuarios_que_assistiram().get(i).getNome())){ 
                    filme.setAvaliacoes(nota);
                    assistiu_o_filme = true;
                    System.out.println(this.nome+" avaliou o filme '"+filme.getTitulo()+"' com nota: "+nota);
                    filme.setAvaliacoes(nota);
                }
            }
        }
        
        if(assistiu_o_filme == false){
            System.out.println(this.nome+" precisa ter assistido o filme '"+filme.getTitulo()+"' para avaliá-lo");
        }
    }
}
