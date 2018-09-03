/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Guilherme
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Cachorro> lista = new ArrayList<>();
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setIdade(3);
        cachorro1.setNome("Scooby");
        lista.add(cachorro1);
        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Ellie");
        cachorro2.setIdade(2);
        lista.add(cachorro2);
        System.out.println("A quantidade de cachorros é: " + lista.size());
        System.out.println("Os nomes dos cachorros são:");
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).getNome());
            System.out.println(lista.get(i).getIdade());
        }
        lista.remove(cachorro1);
        System.out.println("A quantidade de cachorros é: " + lista.size());
        System.out.println("Os nomes dos cachorros são:");
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).getNome());
            System.out.println(lista.get(i).getIdade());
        }
        for(Cachorro c : lista){
            System.out.println(c.getNome());
        }
    }
    
}
