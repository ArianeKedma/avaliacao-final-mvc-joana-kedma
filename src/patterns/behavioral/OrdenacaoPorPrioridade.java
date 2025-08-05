package patterns.behavioral;

import model.Tarefa;
import model.Prioridade;
import java.util.Comparator;

public class OrdenacaoPorPrioridade implements Comparator<Tarefa> {
    public int compare(Tarefa a, Tarefa b) {
        return b.getPrioridade().ordinal() - a.getPrioridade().ordinal();
    }
}