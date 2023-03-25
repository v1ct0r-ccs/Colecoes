package TarefaColecoes_pt2;
import java.util.Scanner;
public class NomesGenero {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula e com o gênero indicado por '-M' ou '-F': ");
        String resposta = s.next();
        String[] nomes = resposta.split(",");
        String[] nomesM = new String[nomes.length];
        String[] nomesF = new String[nomes.length];
        int vetStrM = 0;
        int vetStrF = 0;

        for (String nome : nomes) {
            if (nome.endsWith("-M")){
                nomesM[vetStrM] = nome;
                vetStrM++;
            } else if (nome.endsWith("-F")) {
                nomesF[vetStrF] = nome;
                vetStrF++;
            } else {
                System.out.println("Nome inválido: " + nome);
            }
        }
        // Ordenar nomes Masculinos
        bubbleSort(nomesM, vetStrM);

        // Ordenar nomes Femininos
        bubbleSort(nomesF, vetStrF);

        System.out.println("Nomes Masculinos: ");
        for (int i = 0; i < vetStrM; i++) {
            System.out.println(nomesM[i].replace("-M", "") + " ");
        }
        System.out.println("");

        System.out.println("Nomes Femininos: ");
        for (int i = 0; i < vetStrF; i++) {
            System.out.println(nomesF[i].replace("-F","") + " ");
        }
        System.out.println("");
    }

    private static void bubbleSort(String[] nomes, int n) {
        String aux;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++){
                if (nomes[j].compareTo(nomes[j + 1]) > 0){
                    aux = nomes[j];
                    nomes[j] = nomes[j +  1];
                    nomes[j + 1] = aux;
                }

            }
        }
    }
}
