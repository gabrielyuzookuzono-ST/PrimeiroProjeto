package org.example.model;

public class Cadastro {

    private String nome;
    private int idade;
    private String cidadeNatal;

    public Cadastro (String nome, int idade, String cidadeNatal) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeNatal = cidadeNatal;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

}
