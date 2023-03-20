package src.set;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import src.domain.Aluno;

/**
 * HashSet não tem ordem
 * O acesso aos dados é mais rápido que em um TreeSet, mas nada garante que os dados estarem ordenados.
 * Não repete valores na lista
 */

public class ExemploHashSet {
    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNovo();
    }

    private static void exemploNovo() {
        System.out.println("**** exemploNovo ****");
        Set<Integer> interiros = new HashSet<>();
        interiros.add(1);
        interiros.add(2);
        interiros.add(3);
        System.out.println(interiros);
    }

    /**
     * Não repete valores na lista
     */
    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("**** exemploListaSimplesOrdemAscendente ****");
        Set<String> lista = new HashSet<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
//        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
