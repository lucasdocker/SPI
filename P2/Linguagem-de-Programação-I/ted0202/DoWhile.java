package ted0202;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int num;
        int positivo = 0;
        int negativo = 0;
        int soma = 0;
        float media;
        do {
            System.out.print("Informe um número inteiro (0 para sair): ");
            num = leia.nextInt();
            if(num > 0){
                positivo++;
            } else if(num < 0){
                negativo++;
            }
            soma = soma + num;
        } while(num != 0);
        media = soma/(positivo + negativo);
        System.out.println("Quantidade de números positivos: " + positivo);
        System.out.println("Quantidade de números negativos: " + negativo);
        System.out.println("A soma dos números lidos é: " + soma);
        System.out.printf("A média aritmética é: %.1f", media);
    }
}
