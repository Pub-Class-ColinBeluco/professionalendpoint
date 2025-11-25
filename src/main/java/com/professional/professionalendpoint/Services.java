package com.professional.professionalendpoint;

import java.time.LocalDateTime; // Para Data e Prazo

public class Services {

    // Atributos
    private Long id;
    private String nome;
    private String descricao;
    private String localizacao;
    private LocalDateTime data;
    private Double preco;
    private LocalDateTime prazo;
    private Professional prestador;

    // -------------------------------------------------------------------
    // Getters e Setters
    // -------------------------------------------------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDateTime getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDateTime prazo) {
        this.prazo = prazo;
    }

    public Professional getPrestador() {
        return prestador;
    }

    public void setPrestador(Professional prestador) {
        this.prestador = prestador;
    }
}