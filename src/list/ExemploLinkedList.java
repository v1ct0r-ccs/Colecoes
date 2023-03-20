package src.list;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String args[]) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void  exemploListaSimples(){
        System.out.println("**** exemploListaSimples ****");
        List<String> lista = new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");

        lista.remove(0);
        boolean contem = lista.contains("João da Silva");
        System.out.println(lista);
        System.out.println(contem);

//        /** interação de listas **/
//        for (String nome : lista) {
//            System.out.println(nome);
//        }

//        /** objeto especifico da lista **/
//        System.out.println(lista.get(0));
    }

    private static void exemploListaSimplesOrdemAscendente(){
        System.out.println("**** exemploListaSimplesOrdemAscendente ****");
        List<String> lista = new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
