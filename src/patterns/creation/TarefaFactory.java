package patterns.creation;

import model.Tarefa;
import model.Prioridade;
import java.time.LocalDate;

public class TarefaFactory {
    public static Tarefa criar(String titulo, String desc, Prioridade prioridade, LocalDate prazo) {
        return new Tarefa(titulo, desc, prioridade, prazo);
    }
}