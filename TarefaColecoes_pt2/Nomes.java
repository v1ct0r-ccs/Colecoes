package TarefaColecoes_pt2;
import java.util.*;
public class Nomes {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula: ");

        String resposta = s.next();
        String[] vetStr = resposta.split(",");
        String aux;
        int i = 0;

        for(i = 0; i<vetStr.length; i++){
            for(int j = 0; j<vetStr.length-1; j++){
                if (vetStr[j].compareTo(vetStr[j + 1]) > 0){
                    aux = vetStr[j];
                    vetStr[j] = vetStr[j+1];
                    vetStr[j+1] = aux;
                }
            }
        }
        for(i = 0; i<vetStr.length; i++){
            System.out.println(" "+vetStr[i]);
        }
    }
}
