package ted0203;

public class Verificador {

    private float menorAltura;
    private float maiorAltura;
    private float somaAltura;
    private int numHomens;
    private int numMulheres;

    public float getMenorAltura() {
        return menorAltura;
    }

    public void setMenorAltura(float menorAltura) {
        this.menorAltura = menorAltura;
    }

    public float getMaiorAltura() {
        return maiorAltura;
    }

    public void setMaiorAltura(float maiorAltura) {
        this.maiorAltura = maiorAltura;
    }

    public float getSomaAltura() {
        return somaAltura;
    }

    public void setSomaAltura(float mediaAltura) {
        this.somaAltura = mediaAltura;
    }

    public int getNumHomens() {
        return numHomens;
    }

    public void setNumHomens(int numHomens) {
        this.numHomens = numHomens;
    }

    public int getNumMulheres() {
        return numMulheres;
    }

    public void setNumMulheres(int numMulheres) {
        this.numMulheres = numMulheres;
    }

    public void atualizaMaiorAltura(float altura){
        if(altura > getMaiorAltura()){
            setMaiorAltura(altura);
        }
    }

    public void atualizaMenorAltura(float altura){
        if(altura < getMenorAltura()){
            setMenorAltura(altura);
        }
    }

    public void somaMasculino(float altura, String sexo){
        if(sexo.equalsIgnoreCase("masculino")){
            setSomaAltura(getSomaAltura() + altura);
            setNumHomens(getNumHomens() + 1);
        }
    }

    public void contaFeminino(String sexo){
        if(sexo.equalsIgnoreCase("feminino")){
            setNumMulheres(getNumMulheres() + 1);
        }
    }

    public boolean escreveuCerto(String sexo){
        if(sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("masculino")){
            return false;
        }
        System.out.println("Entrada inválida! Digite direito, home.");
        return true;
    }
}
