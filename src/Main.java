import controller.TarefaController;
import model.Prioridade;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TarefaController controller = new TarefaController();

        controller.adicionar("Estudar Padrões", "Estudar Factory", Prioridade.ALTA, LocalDate.now().plusDays(1));
        controller.adicionar("Fazer almoço", "Cozinhar arroz", Prioridade.BAIXA, LocalDate.now().minusDays(1));
        controller.concluir("Estudar Padrões");

        System.out.println("Todas:");
        controller.listar().forEach(System.out::println);

        System.out.println("Vencidas:");
        controller.listarVencidas().forEach(System.out::println);

        System.out.println("Alta Prioridade:");
        controller.filtrarPorPrioridade(Prioridade.ALTA).forEach(System.out::println);
    }
}