import controller.TarefaController;
import model.Prioridade;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TarefaController controller = new TarefaController();

        controller.adicionar("Estudar pra Prova do Quost", "Estudar Front", Prioridade.ALTA, LocalDate.now().plusDays(1));
        controller.adicionar("Fazer almoço", "Fazer macarrão", Prioridade.BAIXA, LocalDate.now().minusDays(1));
        controller.concluir("Estudar Arquitetura de Sistemas");

        System.out.println("Todas:");
        controller.listar().forEach(System.out::println);

        System.out.println("Vencidas:");
        controller.listarVencidas().forEach(System.out::println);

        System.out.println("Alta Prioridade:");
        controller.filtrarPorPrioridade(Prioridade.ALTA).forEach(System.out::println);
    }
}