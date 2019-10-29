package com.devBootcamp.exercicio1;

public class Telefone {
    private String numeroTelefone;
    private TipoTelefone tipoTelefone;

    public Telefone(String numeroTelefone, TipoTelefone tipoTelefone) {
        this.numeroTelefone = numeroTelefone;
        this.tipoTelefone = tipoTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }
}
