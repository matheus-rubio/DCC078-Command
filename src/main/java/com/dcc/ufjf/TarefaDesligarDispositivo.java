package com.dcc.ufjf;

public class TarefaDesligarDispositivo implements Tarefa {
    private Dispositivo dispositivo;

    public TarefaDesligarDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void executar() {
        this.dispositivo.desligar();
    }

    public void cancelar() {
        this.dispositivo.ligar();
    }
}
