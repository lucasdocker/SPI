package ted02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Aluno a1 = new Aluno();

        System.out.println("Qual foi a primeira nota: ");
        a1.setNota1(scanner.nextFloat());

        System.out.println("Qual foi a segunda nota: ");
        a1.setNota2(scanner.nextFloat());

        a1.status(a1.getNota1(), a1.getNota2());
    }

}
