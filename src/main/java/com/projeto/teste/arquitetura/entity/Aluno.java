package com.projeto.teste.arquitetura.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno extends Pessoa{

    @Column(name = "mensalidade", columnDefinition = "DECIMAL(10,2) DEFAULT 0.0")
    private Double mensalidade;

    public Aluno() {

    }

    public Aluno(Integer id, String nome, Double mensalidade) {
        this.id = id;
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
