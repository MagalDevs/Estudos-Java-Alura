package java_aplicando_A_OrientacaoAObjetos.aulas.aula5.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " o povo tá curtindo, insira na sua playlist!");
        }
    }
}
