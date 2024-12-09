package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio02.d02;

public class SenhaInvalidaException extends RuntimeException {
    private String mensagem;

    public SenhaInvalidaException(String s) {
        this.mensagem = s;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
