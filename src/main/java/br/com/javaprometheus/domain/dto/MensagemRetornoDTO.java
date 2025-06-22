package br.com.javaprometheus.domain.dto;

public record MensagemRetornoDTO(boolean sucesso, String mensagem, Object resultado) {

    public static MensagemRetornoDTO sucesso(String mensagem, Object resultado) {
        return new MensagemRetornoDTO(true, mensagem, resultado);
    }

    public static MensagemRetornoDTO sucesso(String mensagem) {
        return new MensagemRetornoDTO(true, mensagem, null);
    }
    public static MensagemRetornoDTO sucesso(Object resultado) {
        return new MensagemRetornoDTO(true, null, resultado);
    }


    public static MensagemRetornoDTO erro(String mensagem) {
        return new MensagemRetornoDTO(false, mensagem, null);
    }
}
