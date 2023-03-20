package src.set;

import src.domain.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet_Aluno {
    public static void main(String args[]){
        exemploListaSimples();
        exemploConsultando();
        exemploRemover();
    }

    private static void exemploRemover() {
        System.out.println("**** exemploRemover ****");
        Set<Aluno> conjunto = new HashSet<>();
        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOfice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOfice", 0);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);

        conjunto.remove(a);

        System.out.println(conjunto);

        for (Aluno aluno : conjunto) {
            System.out.println(aluno);
        }

    }

    private static void exemploConsultando() {
        System.out.println("**** exemploConsultando ****");
        Set<Aluno> conjunto = new HashSet<>();
        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOfice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOfice", 10);
        Aluno e = new Aluno("Teste", "Internet", 0);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto.contains(e));
    }

    /**
     * Para não repetir objetos na lista de alunos é necessário que a classe Aluno implemente o equals e hashcode
     */
    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Set<Aluno> conjunto = new HashSet<>();
        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOfice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOfice", 0);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
