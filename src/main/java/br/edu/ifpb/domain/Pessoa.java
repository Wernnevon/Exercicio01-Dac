package br.edu.ifpb.domain;

import java.util.UUID;

public class Pessoa {
    private String nome;
    private String id;

    public Pessoa(String nome) {
        this.nome = nome;
        this.id = UUID.randomUUID().toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void alterarNome() {
        this.nome = this.nome.toUpperCase();
    }

    public void alterarNomeMinusculo() {
        this.nome = this.nome.toLowerCase();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
