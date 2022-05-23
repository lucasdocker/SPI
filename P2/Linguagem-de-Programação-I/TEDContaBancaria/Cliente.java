package TEDContaBancaria;

public class Cliente {
    private String nome;
    private String cpf;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;

    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if(valor <= getSaldo()){
            if(valor <= 0){
                System.out.println("Valor inválido para saque.");
            } else{
                this.saldo = getSaldo() - valor;
                System.out.println("Você acaba de sacar R$" + String.format("%.2f", valor) + " e seu novo saldo é de R$" + String.format("%.2f", getSaldo()) + ".");
            }

        } else{
            System.out.println("\nVocê tentou sacar um valor maior do que tem na sua conta.");
            System.out.println("Valor na conta: R$" + String.format("%.2f", getSaldo()) + ".");
            System.out.println("Valor que você tentou sacar: R$" + String.format("%.2f", valor) + ".");
        }
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("\nValor inválido para depósito.");
        } else{
            this.saldo = getSaldo() + valor;
            System.out.println("Você acaba de depositar R$" + String.format("%.2f", valor) + " e o seu novo saldo é de R$" + String.format("%.2f", getSaldo()) + ".");
        }

    }

    public boolean clienteJaRegistrado(String cpf){
        return (this.cpf.equalsIgnoreCase(cpf));
    }
}
