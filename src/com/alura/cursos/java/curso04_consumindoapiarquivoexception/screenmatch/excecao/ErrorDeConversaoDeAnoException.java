package com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.excecao;

//Criamos uma classe de exception, que vai receber a mensagem, neste caso da classe titulo
public class ErrorDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErrorDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
