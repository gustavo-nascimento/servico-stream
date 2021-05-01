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
        
        Usuario usuario1 = new Usuario("Marcos Silva","PIX",true);
        Usuario usuario2 = new Usuario("Silvia Lima","PIX",true);
        Usuario usuario3 = new Usuario("Fernanda Rodrigues","PIX",true);
        Usuario usuario4 = new Usuario("Pedro Lopes","PIX",true);
        
        ArrayList<Usuario> usuarios = new ArrayList();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        
        usuario1.assiste_filme(filme);
        usuario1.avalia_filme(filme, 9);
        System.out.println("\n");
        
        usuario2.assiste_filme(filme);
        usuario2.avalia_filme(filme, 8);
        System.out.println("\n");
        
        usuario3.assiste_filme(filme2);
        usuario3.avalia_filme(filme2, 9.3);
        System.out.println("\n");
        
        usuario4.assiste_filme(filme);
        usuario4.avalia_filme(filme2, 8);
        
        
        ServicoStream servico = new ServicoStream(filmes, usuarios);
        System.out.println("\n");
        System.out.println(servico.filmesPorAno(2019).get(0).getTitulo());
        System.out.println(servico.filmesPorAno(2019).get(1).getTitulo());
        
    }
}
