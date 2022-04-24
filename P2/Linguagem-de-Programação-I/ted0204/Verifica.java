package ted0204;

public class Verifica {
    private int menorValor;
    private int maiorValor;
    private int soma;
    private int pares;

    public int getMenorValor() {
        return menorValor;
    }

    public void setMenorValor(int menorValor) {
        this.menorValor = menorValor;
    }

    public int getMaiorValor() {
        return maiorValor;
    }

    public void setMaiorValor(int maiorValor) {
        this.maiorValor = maiorValor;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getPares() {
        return pares;
    }

    public void setPares(int pares) {
        this.pares = pares;
    }

    public void atualizaMenorValor(int menorValor){
        if(menorValor < getMenorValor()){
            setMenorValor(menorValor);
        }
    }

    public void atualizaMaiorValor(int maiorValor){
        if(maiorValor > getMaiorValor()){
            setMaiorValor(maiorValor);
        }
    }

    public void somaValores(int valor){
        setSoma(getSoma() + valor);
    }

    public void somaPares(int valor){
        if(valor % 2 == 0){
            setPares(getPares() + valor);
        }
    }


}
