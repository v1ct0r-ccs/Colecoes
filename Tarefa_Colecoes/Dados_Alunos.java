package Tarefa_Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dados_Alunos {
    public static void main(String args[]){
        grupoA();
    }

    private static void grupoA() {

        System.out.println("**** Grupo A - Curso 2023 ****");
        List<Alunos> alunos = new ArrayList<>();
        Alunos a = new Alunos("Amanda Teixeira", "Feminino", 0);
        Alunos b = new Alunos("Carlos Bruno", "Masculino", 0);
        Alunos c = new Alunos("Hugo Chaves", "Masculino", 0);
        Alunos d = new Alunos("Daniele Pinho", "Feminino", 0);
        Alunos e = new Alunos("Antonio Vinicios", "Masculino", 0);
        Alunos f = new Alunos("Luana Vargas", "Feminino", 0);
        Alunos g = new Alunos("Bianca Crocetti", "Feminino", 0);
        Alunos h = new Alunos("Cesar Franchi", "Masculino", 0);
        Alunos i = new Alunos("Thainara Prado", "Feminino", 0);
        Alunos j = new Alunos("Angela dos Santos", "Feminino", 0);
        Alunos k = new Alunos("Henrique Araujo", "Masculino", 0);
        Alunos l = new Alunos("Fernanda Neiva", "Feminino", 0);
        Alunos m = new Alunos("Alexandra Amorim", "Feminino", 0);
        Alunos n = new Alunos("Karen Jorgensen", "Feminino", 0);
        Alunos o = new Alunos("Marcio Andre", "Masculino", 0);
        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        alunos.add(d);
        alunos.add(e);
        alunos.add(f);
        alunos.add(g);
        alunos.add(h);
        alunos.add(i);
        alunos.add(j);
        alunos.add(k);
        alunos.add(l);
        alunos.add(m);
        alunos.add(n);
        alunos.add(o);
        Collections.sort(alunos);
        System.out.println(alunos);

        List<Alunos> homens = new ArrayList<>();
        List<Alunos> mulheres = new ArrayList<>();

        for (Alunos aluno : alunos) {
            if (aluno.getGenero().equals("Masculino")){
                homens.add(aluno);
            } else if (aluno.getGenero().equals("Feminino")){
                mulheres.add(aluno);
            }
        }

        Collections.sort(homens);
        Collections.sort(mulheres);

        System.out.println("**** Classe Masculina - Sala 1 ****");
        for (Alunos homem : homens){
            System.out.println("Masc. - " + homem.getNome());
        }
        System.out.println("**** Classe Feminina - Sala 2 ****");
        for (Alunos mulher : mulheres){
            System.out.println("Femi. - " + mulher.getNome());
        }
    }
}
