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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String atores[] = new String[4];
        atores[0] = "Harry Styles";
        atores[1] = "Fionn Whitehead";
        atores[2] = "Tom Hardy";
        atores[3] = "Cillian Murphy";
        
        String generos[] = new String[2];
        generos[0] = "guerra";
        generos[1] = "ação";
        
        Filme filme = new Filme("Dunkirk",2019,"Christopher Nolan",atores,generos,2000000,8.8);
        
        String atores2[] = new String[4];
        atores2[0] = "Tom Holland";
        atores2[1] = "Zendaya";
        atores2[2] = "Jake Gyllenhaal";
        atores2[3] = "Jacob Batalon";
        
        String generos2[] = new String[2];
        generos2[0] = "aventura";
        generos2[1] = "ação";
        
        Filme filme2 = new Filme("Homem-Aranha: Longe de Casa",2019,"Jon Watts",atores2,generos2,3000000,9);
        
        ArrayList<Filme> filmes = new ArrayList();
        filmes.add(filme);
        filmes.add(filme2);
        
        Cliente cliente1 = new Cliente("82793244","Marcos Silva","PIX",true);
        Cliente cliente2 = new Cliente("23849034","Silvia Lima","PIX",true);
        Cliente cliente3 = new Cliente("82724434","Fernanda Rodrigues","PIX",true);
        Cliente cliente4 = new Cliente("19191344","Pedro Lopes","PIX",true);
        
        Funcionario funcionario1 = new Funcionario("87797214","Henrique Silva","183.95546.95-0", 1823);
        Funcionario funcionario2 = new Funcionario("23669024","Silvia Maria","104.23310.55-8", 1600);
        Funcionario funcionario3 = new Funcionario("82788434","Fernanda Lima","266.54532.48-0", 1400);
        Funcionario funcionario4 = new Funcionario("77791344","Pedro Silva","885.90784.37-8", 1100);
        
        ArrayList<Cliente> clientes = new ArrayList();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        
        cliente1.assiste_filme(filme);
        cliente1.avalia_filme(filme, 9);
        System.out.println("\n");
        
        cliente2.assiste_filme(filme);
        cliente2.avalia_filme(filme, 8);
        System.out.println("\n");
        
        cliente3.assiste_filme(filme2);
        cliente3.avalia_filme(filme2, 9.3);
        System.out.println("\n");
        
        cliente4.assiste_filme(filme);
        cliente4.avalia_filme(filme2, 8);
        
        ArrayList<Funcionario> funcionarios = new ArrayList();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        
        ServicoStream servico = new ServicoStream(filmes, clientes, funcionarios);
        
        System.out.println("\n");
        System.out.println(servico.filmesPorAno(2019).get(0).getTitulo());
        System.out.println(servico.filmesPorAno(2019).get(1).getTitulo());
        
    }
}
