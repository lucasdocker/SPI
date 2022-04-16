package ted02;

public class Aluno {

    private float nota1;
    private float nota2;

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void status(float nota1, float nota2) {
        float media = (nota1 + nota2)/2;
        if(media >= 0 && media < 5){
            System.out.println("Média: " + media);
            System.out.println("Status: Em Recuperação");
            System.out.println("Nota necessária pra passar: " + (10 - media + 2));
        } else if(media >= 5 && media < 7){
            System.out.println("Média: " + media);
            System.out.println("Status: Na Final");
            System.out.println("Nota necessária pra passar: " + (10 - media));
        } else if(media >= 7 && media < 10){
            System.out.println("Média: " + media);
            System.out.println("Status: Aprovado!");
        } else {
            System.out.println("Notas inválidas");
        }
    }

}
