package ted0201;
import java.util.Scanner;
import java.util.Random;

public class Advinhacao {
    public static void main(String[] args){
        Random r = new Random();
        Scanner leia = new Scanner(System.in);
        int valor = r.nextInt(0, 10);
        boolean i = true;
        int count = 0;
        int chute;
        while(i){
            System.out.print("Informe um número de 0 a 10: ");
            chute = leia.nextInt();
            count++;
            if(chute < 0 || chute > 10){
                System.out.println("Por favor, informe um número entre 0 e 10.");
            } else {
                if (chute == valor) {
                    if (count == 1) {
                        System.out.println("Parabéns! Você acertou em " + count + " tentativa.");
                        i = false;
                    } else {
                        System.out.println("Parabéns! Você acertou em " + count + " tentativas.");
                        i = false;
                    }
                } else if (chute < valor) {
                    System.out.println("Errou! Tente um número maior.");
                } else if (chute > valor) {
                    System.out.println("Errou! Tente um número menor.");
                } else {
                    System.out.println("Valor inválido! Tente novamente.");
                }
            }
        }

    }
}
