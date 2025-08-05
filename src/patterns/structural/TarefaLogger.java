package patterns.structural;

import model.Tarefa;

public class TarefaLogger {
    public static void log(Tarefa t) {
        System.out.println("LOG: " + t);
    }
}