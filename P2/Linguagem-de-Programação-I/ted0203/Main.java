package ted0203;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Verificador verificador = new Verificador();
        float[] alturas = new float[10];


        verificador.setMaiorAltura(0F);
        verificador.setSomaAltura(0F);
        verificador.setNumHomens(0);
        verificador.setNumMulheres(0);


        for(int i = 0; i < 10; i++){
            boolean j = true;
            while(j) {
                System.out.print("Informe o sexo da pessoa " + (i + 1) + " (masculino/feminino): ");
                pessoa.setSexo(leia.next());
                j = verificador.escreveuCerto(pessoa.getSexo());
            }
            System.out.print("Informe a altura da pessoa " + (i + 1) + " (em metros): ");
            pessoa.setAltura(leia.nextFloat());
            alturas[i] = pessoa.getAltura();
            verificador.atualizaMaiorAltura(pessoa.getAltura());
            verificador.somaMasculino(pessoa.getAltura(), pessoa.getSexo());
            verificador.contaFeminino(pessoa.getSexo());
        }

        verificador.setMenorAltura(verificador.getMaiorAltura());

        for(int i = 0; i < 10; i++){
            verificador.atualizaMenorAltura(alturas[i]);
        }

        System.out.printf("\nMaior altura do grupo: %.2fm.\n", verificador.getMaiorAltura());
        System.out.printf("Menor altura do grupo: %.2fm.\n", verificador.getMenorAltura());
        System.out.printf("Média da altura dos homens: %.2fm.\n", verificador.getSomaAltura()/verificador.getNumHomens());
        System.out.println("Número de mulheres: " + verificador.getNumMulheres() + ".");
        System.out.println("\nFim do programa!!");

    }
}
