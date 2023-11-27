package com.dcc.ufjf;

public class TarefaLigarDispositivo implements Tarefa {
    
    private Dispositivo dispositivo;

    public TarefaLigarDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void executar() {
        this.dispositivo.ligar();
    }

    public void cancelar() {
        this.dispositivo.desligar();
    }
}