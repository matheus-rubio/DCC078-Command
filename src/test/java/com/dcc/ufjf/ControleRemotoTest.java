package com.dcc.ufjf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControleRemotoTest {

    ControleRemoto controleRemoto;
    Dispositivo lampada;
    Dispositivo televisao;

    @BeforeEach
    void setUp() {
        controleRemoto = new ControleRemoto();
        lampada = new Lampada();
        televisao = new Televisao(2020, "Samsung");
    }

    @Test
    void deveLigarLampada() {
        Tarefa ligarLampada = new TarefaLigarDispositivo(lampada);
        controleRemoto.executarTarefa(ligarLampada);

        assertEquals("Lâmpada Ligada", ((Lampada) lampada).getStatus());
    }

    @Test
    void deveDesligarLampada() {
        Tarefa desligarLampada = new TarefaDesligarDispositivo(lampada);
        controleRemoto.executarTarefa(desligarLampada);

        assertEquals("Lâmpada Desligada", ((Lampada) lampada).getStatus());
    }

    @Test
    void deveLigarTelevisao() {
        Tarefa ligarTelevisao = new TarefaLigarDispositivo(televisao);
        controleRemoto.executarTarefa(ligarTelevisao);

        assertEquals("Televisão Ligada", ((Televisao) televisao).getStatus());
    }

    @Test
    void deveDesligarTelevisao() {
        Tarefa desligarTelevisao = new TarefaDesligarDispositivo(televisao);
        controleRemoto.executarTarefa(desligarTelevisao);

        assertEquals("Televisão Desligada", ((Televisao) televisao).getStatus());
    }

    @Test
    void deveCancelarDesligamentoLampada() {
        Tarefa ligarLampada = new TarefaLigarDispositivo(lampada);
        Tarefa desligarLampada = new TarefaDesligarDispositivo(lampada);

        controleRemoto.executarTarefa(ligarLampada);
        controleRemoto.executarTarefa(desligarLampada);

        controleRemoto.cancelarUltimaTarefa();

        assertEquals("Lâmpada Ligada", ((Lampada) lampada).getStatus());
    }

    @Test
    void deveCancelarDesligamentoTelevisao() {
        Tarefa ligarTelevisao = new TarefaLigarDispositivo(televisao);
        Tarefa desligarTelevisao = new TarefaDesligarDispositivo(televisao);

        controleRemoto.executarTarefa(ligarTelevisao);
        controleRemoto.executarTarefa(desligarTelevisao);

        controleRemoto.cancelarUltimaTarefa();

        assertEquals("Televisão Ligada", ((Televisao) televisao).getStatus());
    }
}

