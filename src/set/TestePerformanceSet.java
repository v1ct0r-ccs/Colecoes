package src.set;

import src.domain.Aluno;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class TestePerformanceSet {
    public static void main(String args[]){
        Random r = new Random();

        HashSet<Aluno> hashSet = new HashSet<>();
        TreeSet<Aluno> treeSet = new TreeSet<>();
        LinkedHashSet<Aluno> linkedHashSet = new LinkedHashSet<Aluno>();

        // Start time - HashSet
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            hashSet.add(new Aluno("João da Silva", "Linux básico", x));
        }
        //End time
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("HashSet: " + duration);


        // Start time - TreeSet
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++){
            int x = r.nextInt(1000 - 10) + 10;
            treeSet.add(new Aluno("João da Silva", "Linux básico", x));
        }
        //End time
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
            System.out.println("TreeSet: " + duration);

        // Start time - LinkedSet
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            linkedHashSet.add(new Aluno("João da Silva", "Linux básico", x));
        }
        // End time
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedHashSet: " + duration);
        }
    }
