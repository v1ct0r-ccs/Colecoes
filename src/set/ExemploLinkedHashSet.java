package src.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Seus elementos são interados na ordem em que foram inceridos.
 *
 */
public class ExemploLinkedHashSet {
    public static void main(String args[]) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Set<String> lista = new LinkedHashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }
}
