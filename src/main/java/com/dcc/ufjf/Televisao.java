package com.dcc.ufjf;

public class Televisao implements Dispositivo {

    private int ano;
    private String modelo;
    private String status;

    public Televisao(int ano, String modelo) {
        this.ano = ano;
        this.modelo = modelo;
    }

    public String getStatus() {
        return this.status;
    }

    public void ligar() {
        this.status = "Televisão Ligada";
    }

    public void desligar() {
        this.status = "Televisão Desligada";
    }
}