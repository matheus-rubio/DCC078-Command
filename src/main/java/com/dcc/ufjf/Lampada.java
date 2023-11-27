package com.dcc.ufjf;

public class Lampada implements Dispositivo {

    private String status;

    public String getStatus() {
        return this.status;
    }

    public void ligar() {
        this.status = "Lâmpada Ligada";
    }

    public void desligar() {
        this.status = "Lâmpada Desligada";
    }
}
