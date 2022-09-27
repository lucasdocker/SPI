package com.uniesp.aula1.padroesdeprojetos.atividadeMercado;

import java.util.Scanner;

public class ProdutoApp {


    public static void main(String[] args) {

        Produtos produto = new Produtos();
        Scanner sc = new Scanner(System.in);

        boolean j = true;
        while (j) {
            System.out.println("1 - Calcular Preço de Produto");
            System.out.println("2 - Sair");
            System.out.print("");
            int resp = sc.nextInt();
            if(resp == 1) {
                System.out.println("Nome do produto: ");
                produto.setNome(sc.next());
                System.out.println("Preço do produto: ");
                produto.setPreco(sc.nextDouble());
                boolean i = true;
                while (i) {
                    System.out.println("Dia da semana");
                    System.out.println("1 - Domingo");
                    System.out.println("2 - Segunda");
                    System.out.println("3 - Terça");
                    System.out.println("4 - Quarta");
                    System.out.println("5 - Quinta");
                    System.out.println("6 - Sexta");
                    System.out.println("7 - Sábado");
                    System.out.println("0 - Sair");
                    System.out.print("");
                    int respDia = sc.nextInt();
                    if(respDia == 0){
                        i = false;
                    } else if(respDia >= 1 && respDia <= 7) {
                        System.out.print("Informe a hora da compra (HH): ");
                        int hora = sc.nextInt();
                        System.out.print("Informe o minuto da compra (MM): ");
                        int minuto = sc.nextInt();
                        System.out.print("Informe o segundo da compra (SS): ");
                        int segundo = sc.nextInt();
                        double precoNovo = produto.promocaoParaVoce(produto.diaDaSemana(respDia), produto.getPreco(),hora);
                        System.out.println("O preço do produto " + produto.getNome() + " é R$" + precoNovo + " e foi comprado às " + produto.horario(hora, minuto, segundo) + " de " + produto.diaDaSemanaExtenso(respDia) + ".");
                        boolean w = true;
                        while(w) {
                            System.out.println("Continuar?\n1- Sim\n2- Não");
                            int respContinuar = sc.nextInt();
                            if (respContinuar == 2) {
                                j = false;
                                i = false;
                                w = false;
                            } else if (respContinuar == 1) {
                                w = false;
                                i = false;
                            } else {
                                System.out.println("Resposta inválida! Tente novamente.");
                            }
                        }
                    } else{
                        System.out.println("Opção inválida! Tente novamente.");
                    }
                }
            } else if(resp == 2){
                System.out.println("Saindo...");
                j = false;
            } else{
                System.out.println("Resposta inválida! Tente novamente.");
            }
        }

    }
}
