package java_aplicando_A_OrientacaoAObjetos.Atividades_praticas.aula2.classes;

public class Aluno {
    private String nome;
    private double notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public void calcularMedia(){
        if(notas >= 7){
            System.out.println("Aluno: " + nome + " Aprovado");
        }else{
            System.out.println("Aluno: " + nome + " Reprovado");
        }
    }
}
