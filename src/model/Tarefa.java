package model;

import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private LocalDate prazo;
    private boolean concluida;

    public Tarefa(String titulo, String descricao, Prioridade prioridade, LocalDate prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.prazo = prazo;
        this.concluida = false;
    }

    public boolean isVencida() {
        return !concluida && prazo.isBefore(LocalDate.now());
    }

    public void concluir() {
        this.concluida = true;
    }

    public String getTitulo() { return titulo; }
    public Prioridade getPrioridade() { return prioridade; }
    public boolean isConcluida() { return concluida; }

    public String toString() {
        return titulo + " (" + prioridade + ") - " + (concluida ? "Concluída" : "Pendente");
    }
}