package src.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestePerformanceList {
    public static void main(String args[]) {
        testeArrayListAdd();
        testeLinkedListAdd();

        testeArrayListRemove();
        testeLinkedListRemove();
    }

    private static void testeArrayListAdd() {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            lista.add(i);
        }

        for (int i = 0; i < MAX; i++) {
            lista.add(i);
        }
        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total Array List ADD: " + (tFim - tInicio));
    }
    private static void testeLinkedListAdd() {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new LinkedList<>();
        for (int i = 0; i < MAX; i++) {
            lista.add(i);
        }

        for (int i = 0; i < MAX; i++) {
            lista.add(i);
        }
        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total Linked List ADD: " + (tFim - tInicio));
    }
    private static void testeArrayListRemove() {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            lista.add(i);
        }

        for (int i = MAX -1; i > 0; i--) {
            lista.remove(i);
        }
        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total Array List Remove: " + (tFim - tInicio));
    }
    private static void testeLinkedListRemove() {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new LinkedList<>();
        for (int i = 0; i < MAX; i++) {
            lista.add(i);
        }

        for (int i = MAX -1; i > 0; i--) {
            lista.remove(i);
        }
        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total Linked List Remove: " + (tFim - tInicio));
    }


}
