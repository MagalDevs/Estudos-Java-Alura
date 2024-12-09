package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio02.d03;

public class ErroConsultaGitHubException extends RuntimeException {
    private String mensagem;

    public ErroConsultaGitHubException(String usuárioNãoEncontrado) {
        this.mensagem = usuárioNãoEncontrado;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
