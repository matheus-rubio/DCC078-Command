package com.dcc.ufjf;

import java.util.ArrayList;
import java.util.List;

public class ControleRemoto {

    private List<Tarefa> comandos = new ArrayList<>();

    public void executarTarefa(Tarefa tarefa) {
        this.comandos.add(tarefa);
        tarefa.executar();
    }

    public void cancelarUltimaTarefa() {
        if (!comandos.isEmpty()) {
            Tarefa tarefa = comandos.get(comandos.size() - 1);
            tarefa.cancelar();
            comandos.remove(comandos.size() - 1);
        }
    }
}