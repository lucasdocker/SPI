package TEDContaBancaria;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/*
GRUPO:
- Anna Lyvia Santos de Medeiros
- João Vitor Morais Costa
- Lucas Correia Lucena de Souza Ribeiro
- Mateus Correia Pereira Gomes
*/


public class Principal {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        int opcao;
        boolean menuAtivo = true;
        boolean encontrou;
        String cpfInformado;

        while(menuAtivo){
            System.out.println();
            System.out.println("~~~~~~ SEJA BEM VINDO(A) AO JAVA BANK ~~~~~~\n");
            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Consultar Saldo");
            System.out.println("3- Realizar Saque");
            System.out.println("4- Realizar Depósito");
            System.out.print("5- Sair\n> ");
            opcao = leia.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("~~~~~~ CADASTRAR CLIENTE ~~~~~~\n");
                    encontrou = false;
                    Cliente clienteAtual = new Cliente();
                    System.out.print("Informe o nome do(a) cliente: ");
                    clienteAtual.setNome(leia.next());
                    System.out.print("Informe o CPF do(a) cliente: ");
                    clienteAtual.setCpf(leia.next());
                    for(Cliente c : clientes){
                        if(c.getCpf().equalsIgnoreCase(clienteAtual.getCpf())){
                            encontrou = true;
                            break;
                        }
                    }
                    if(!encontrou){
                        System.out.println();
                        System.out.println("Cliente cadastrado(a) com sucesso!");
                        clientes.add(clienteAtual);
                    } else{
                        System.out.println("\nEsse CPF já se encontra registrado no sistema.\nOperação abortada...");
                    }
                    break;

                case 2:
                    System.out.println("\n~~~~~~ CONSULTAR SALDO ~~~~~~\n");
                    encontrou = false;
                    System.out.print("Por favor, informe o CPF do(a) cliente: ");
                    cpfInformado = leia.next();

                    for(Cliente c : clientes){
                        if(c.getCpf().equalsIgnoreCase(cpfInformado)){
                            System.out.println("\nO saldo de " + c.getNome() + " é R$" + String.format("%.2f", c.getSaldo()) + ".");
                            encontrou = true;
                            break;
                        }
                    }
                    if(!encontrou){
                        System.out.println("\nO CPF informado não consta na nossa base de dados.");
                    }
                    break;

                case 3:
                    System.out.println("\n~~~~~~ SAQUE ~~~~~~\n");
                    encontrou = false;
                    System.out.print("Por favor, informe o CPF do(a) cliente: ");
                    cpfInformado = leia.next();

                    for(Cliente c : clientes){
                        if(c.getCpf().equalsIgnoreCase(cpfInformado)){
                            System.out.print("Informe o valor a ser sacado: ");
                            c.sacar(leia.nextDouble());
                            encontrou = true;
                            break;
                        }
                    }
                    if(!encontrou){
                        System.out.println("\nO CPF informado não consta na nossa base de dados.");
                    }
                    break;

                case 4:
                    System.out.println("\n~~~~~~ DEPÓSITO ~~~~~~\n");
                    encontrou = false;
                    System.out.print("Por favor, informe o CPF do(a) cliente: ");
                    cpfInformado = leia.next();
                    for(Cliente c : clientes){
                        if(c.getCpf().equalsIgnoreCase(cpfInformado)){
                            System.out.print("Informe o valor a ser depositado: ");
                            c.depositar(leia.nextDouble());
                            encontrou = true;
                            break;
                        }
                    }
                    if(!encontrou){
                        System.out.println("\nO CPF informado não consta na nossa base de dados.");
                    }
                    break;
                case 5:
                    menuAtivo = false;
                    System.out.println("\n~~~~~~ FIM DO PROGRAMA ~~~~~~");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        }
    }
}
