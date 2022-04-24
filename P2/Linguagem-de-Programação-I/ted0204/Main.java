package ted0204;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int intArray[] = new int[10];
        Verifica verifica = new Verifica();

        verifica.setMaiorValor(0);
        verifica.setSoma(0);
        verifica.setPares(0);

        for(int i = 0; i < intArray.length; i++){
            System.out.print("Informe um número inteiro: ");
            intArray[i] = leia.nextInt();
            verifica.atualizaMaiorValor(intArray[i]);
            verifica.somaValores(intArray[i]);
            verifica.somaPares(intArray[i]);
        }

        verifica.setMenorValor(verifica.getMaiorValor());

        for(int i = 0; i < intArray.length; i++){
            verifica.atualizaMenorValor(intArray[i]);
        }

        System.out.println("Menor valor informado: " + verifica.getMenorValor());
        System.out.println("Maior valor informado: " + verifica.getMaiorValor());
        System.out.println("Soma de todos os números: " + verifica.getSoma());
        System.out.println("Soma de todos os números pares: " + verifica.getPares());
    }
}
