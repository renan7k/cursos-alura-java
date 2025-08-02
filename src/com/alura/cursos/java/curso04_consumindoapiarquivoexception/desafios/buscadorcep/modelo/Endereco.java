package com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios.buscadorcep.modelo;

public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String regiao;

    @Override
    public String toString() {
        return "Endereco{" +
                "cep= " + cep + "\n" +
                "logradouro=" + logradouro + "\n" +
                "complemento=" + complemento + "\n" +
                "bairro=" + bairro + "\n" +
                "localidade=" + localidade + "\n" +
                "uf=" + uf + "\n" +
                "regiao=" + regiao + '}';
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
