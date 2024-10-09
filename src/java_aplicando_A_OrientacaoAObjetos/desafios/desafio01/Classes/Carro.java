package java_aplicando_A_OrientacaoAObjetos.desafios.desafio01.Classes;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade(){
        return ano - 2024;
    }
}
