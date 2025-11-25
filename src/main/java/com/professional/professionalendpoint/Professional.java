package com.professional.professionalendpoint;

import java.util.List;
import java.time.LocalDateTime; // Ou java.util.Date, dependendo da sua preferência

public class Professional {

    // Atributos de Instância
    private Long id;
    private String nome;
    private String cep;
    private String password;
    private List<String> habilidades;
    private List<String> servicosBacklog;
    private List<String> servicosAndamento;
    private List<LocalDateTime> disponibilidade;
    private List<LocalDateTime> agenda;
    private List<Double> orcamento;
    private List<Double> notas;
    private Double avaliacaoMedia;

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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public List<String> getServicosBacklog() {
        return servicosBacklog;
    }

    public void setServicosBacklog(List<String> servicosBacklog) {
        this.servicosBacklog = servicosBacklog;
    }

    public List<String> getServicosAndamento() {
        return servicosAndamento;
    }

    public void setServicosAndamento(List<String> servicosAndamento) {
        this.servicosAndamento = servicosAndamento;
    }

    public List<LocalDateTime> getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(List<LocalDateTime> disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public List<LocalDateTime> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<LocalDateTime> agenda) {
        this.agenda = agenda;
    }

    public List<Double> getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(List<Double> orcamento) {
        this.orcamento = orcamento;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public Double getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public void setAvaliacaoMedia(Double avaliacaoMedia) {
        this.avaliacaoMedia = avaliacaoMedia;
    }
}