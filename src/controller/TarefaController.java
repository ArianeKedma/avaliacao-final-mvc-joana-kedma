package controller;

import model.Tarefa;
import model.Prioridade;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TarefaController {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(String titulo, String desc, Prioridade p, LocalDate prazo) {
        if (titulo == null || titulo.isEmpty()) return;
        tarefas.add(new Tarefa(titulo, desc, p, prazo));
    }

    public List<Tarefa> listar() {
        return tarefas;
    }

    public List<Tarefa> listarVencidas() {
        return tarefas.stream().filter(Tarefa::isVencida).toList();
    }

    public List<Tarefa> filtrarPorPrioridade(Prioridade p) {
        return tarefas.stream().filter(t -> t.getPrioridade() == p).toList();
    }

    public void concluir(String titulo) {
        tarefas.stream().filter(t -> t.getTitulo().equals(titulo)).findFirst().ifPresent(Tarefa::concluir);
    }
}