package src.array;

public class ExemplosArray {
    public static void main(String args[]) {
        declaracaoArray();
        tamanhoArray();
        percorrendoArray1();
        percorrendoArray2();
        arrayBidimensional();
        novoArray();
    }

    private static void novoArray() {
        System.out.println("**** novoArray ****");
        String [] nomes = new String[4];
        nomes[0] = "Rodrigo";
        nomes[1] = "Pires";
        nomes[2] = "Victor";
        nomes[3] = "Bruno";
//        System.out.println(nomes[0]);
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    private static void percorrendoArray2() {
        System.out.println("**** percorrendoArray2 ****");
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println(arrayNum[i]);
        }
    }

    private static void percorrendoArray1() {
        System.out.println("**** percorrendoArray1 ****");
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;
        // Adiciona o valor de cadda elemento ao total
        for (int i : arrayNum) {
            total += i;
        }
        System.out.println("1 - total de elementos arrayNum: " + total);
    }

    private static void tamanhoArray() {
        System.out.println("**** tamanhoArray ****");
        int[] arrayUm = {12,3,5,68,9,6,73,44,459,65,321};
        int[] arrayDois = {43,42,4,8,55,21,2,45};

        if (arrayDois.length > 8){
            System.out.println("Tamanho do ArrayDois - Maior que 8!");
        }else {
            System.out.println("Tamanho do ArrayDois - Menor que 8!");
        }
        System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
    }

    private static void declaracaoArray() {
        System.out.println("**** declaracaoArray ****");
        //[] - são inseridos em uma variável que refencia um array
        int[] a = new int[4];
        // Outra maneira de fazer uma declaração de array
        int[] b;
        b = new int[10];
        //Declarando vários arrays
        int[] r = new int [44], k = new int[23];

        //{} - inicializar valores em um array sua declaração
        int[] iniciarValores = {12, 32, 54, 6, 8, 89, 64, 64, 6};

        // Declara um array de inteiros
        int[] meuArray;

        // Aloca memória para 10 inteiros
        meuArray = new int[10];

        //Inicializa o primeiro elemento
        meuArray [0] = 100;

        // Inicializa o Primeiro Elemnto
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;
        //meuArray [10] = 564; // Estoura a pilha pois não existe o índice 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
    }

    private static void arrayBidimensional() {
        System.out.println("**** arrayBidimensional ****");
        int[][] array1 = { { 1,2,3 }, { 4,5,6 } };
        int[][] array2 = { { 1,2 }, { 3 }, { 4,5,6 } };

        System.out.println("Valores no array1 passados na linha são");
        outputArray( array1 ); //exibe o array 2 por linha

        System.out.println("Valores no array2 passados na linha são");
        outputArray( array2 ); //exibe o array 2 por linha
    }

    private static void outputArray(int[][] array) {
        //Faz um loop pelas linhas do array
        for(int linha = 0; linha < array.length; linha++) {
            //Faz Loop pelas colunas da linha atual
            for(int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("%d ", array[linha][coluna]);
            }
            System.out.println();
        }
    }
}
