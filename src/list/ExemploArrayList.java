package src.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * É como uma array cujo tamnho pode crescer.
 * A busca de um elemnto é rápida, mas inserções e exclusões não são.
 *
 */

public class ExemploArrayList {

    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumero();
    }

    private static void exemploNumero() {
        System.out.println("**** exemploNumero ****");
        List<Integer> numero = new ArrayList<>();
        numero.add(1);
        numero.add(3);
        System.out.println(numero);
    }

    static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("**** exemploListaSimplesOrdemAscendente ****");
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
