package com.uniesp.aula1.padroesdeprojetos.atividadeMercado;

public class Produtos implements DiaEHorario{

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int diaDaSemana(int dia) {
        return dia;
    }

    @Override
    public String horario(int hora, int min, int seg) {
        return hora + ":" + min + ":" + seg;
    }

    @Override
    public String diaDaSemanaExtenso(int dia) {
        switch (dia){
            case 1:
                return "Domingo";
            case 2:
                return "Segunda";
            case 3:
                return "Terça";
            case 4:
                return "Quarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            case 7:
                return "Sábado";
        }
        return null;
    }

    public double promocaoParaVoce(int dia, double preco, int hora){
        if (dia == 1 || dia == 7){
            return preco * 0.9;
        } else if (hora >= 20){
            return preco * 0.9;
        } else{
            return preco;
        }
    }

}
