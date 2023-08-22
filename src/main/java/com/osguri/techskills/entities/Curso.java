package com.osguri.techskills.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name = "tb_cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cursoId;
    @NotNull
    private String nome;
    private String descricao;

    public Curso() {
    }

    public Curso(Long cursoId, String nome, String descricao) {
        this.cursoId = cursoId;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso curso)) return false;
        return Objects.equals(getCursoId(), curso.getCursoId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCursoId());
    }
}
