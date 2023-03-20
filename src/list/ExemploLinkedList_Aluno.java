package src.list;

import src.domain.Aluno;
import src.domain.ComparaNotaAluno;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList_Aluno {
    public static void main(String args[]){
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println(" **** exemploListaSimplesOrdenadaClasseExterna ****");
        List<Aluno> lista = new LinkedList<>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println(" **** exemploListaSimplesOrdenadaComparatorAluno ****");
        List<Aluno> lista = new LinkedList<>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 30);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 20);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 10);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista sem ordenar " + lista);
        Collections.sort(lista);
        System.out.println("lista ordenada " + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista ordenada por nota " + lista);

        System.out.println("");
    }
}
