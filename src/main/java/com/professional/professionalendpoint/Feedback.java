package com.professional.professionalendpoint;

public class Feedback {
    private String descricao;
    private byte nota;

    public Feedback() {}

    public Feedback(String descricao, byte nota) {
        this.descricao = descricao;
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte getNota() {
        return nota;
    }

    public void setNota(byte nota) {
        this.nota = nota;
    }
}
