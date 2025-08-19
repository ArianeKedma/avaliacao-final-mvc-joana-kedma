<h1 align="center"> Sistema de gestão de tarefas </h1>
<p align="center"> Esta é a segunda parte da prova de Arquiterura de Sistemas e tem como proposta desenvolver um sistema de tarefas simples, com camadas bem definidas e aplicação dos padrões de projeto e arquitetura aprendidos nos Módulos 1 e 2. </p>

# Índice
- [Tecnologias Utilizadas](#tecnologias)
- [Qual arquitetura foi escolhida](#arquitetura)
- [Quais padrões foram aplicados e porquê](#padrões)
- [Como rodar o Sistema](#tutorial)
- [Alunas](#alunas) 

# Tecnologias
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" width="60" /> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg"  width="60"/>
          

# Arquitetura
A arquitetura escolhida foi **MVC (Model–View–Controller)**:
- **Model (`src/model/`)** → contém as classes de domínio, como `Tarefa` e `Prioridade`, que representam os dados e regras de negócio.
- **Controller (`src/controller/`)** → contém a lógica de controle, como `TarefaController`, responsável por gerenciar as operações sobre as tarefas.
- **View** → implementada via console no `Main.java`, permitindo interação do usuário.

# Padrões
- **Factory (`src/patterns/creation/TarefaFactory`)**
  - Usado para **centralizar e padronizar a criação de tarefas**, facilitando a manutenção e evitando duplicação de código.

- **Logger (`src/patterns/structural/TarefaLogger`)**
  - Um padrão **estrutural** para registrar ações executadas no sistema (ex.: criação, listagem ou exclusão de tarefas), garantindo rastreabilidade.

- **Strategy (`src/patterns/behavioral/OrdenacaoPorPrioridade`)**
  - Um padrão **comportamental** usado para **ordenar tarefas por prioridade** de forma flexível, permitindo trocar ou estender critérios de ordenação no futuro.

# Tutorial
1. **Pré-requisitos**
   - Java 17+ instalado.
   - A IDE utilizada por nós foi a IntelliJ IDEA, porém, você pode optar por outra de sua preferência desde que ela seja compatível com o Java.

2. **Execução**
   - Abra o projeto no IntelliJ.
   - Compile o código (`Build > Build Project`).
   - Rode a classe `Main.java` localizada em `src/`.

3. **Exemplo de uso (via console)**
   - O usuário será guiado por menus no console.
   - Exemplos de interações:
     - Criar uma nova tarefa definindo título, descrição e prioridade.
     - Listar tarefas ordenadas por prioridade.
     - Excluir tarefas já concluídas.

# Alunas
| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/141370991?v=4" width=115><br><sub>Joana Pixel</sub>](https://github.com/JoanaPixel) | [<img loading="lazy" src="https://avatars.githubusercontent.com/u/173846259?v=4" width=115><br><sub>Ariane Kedma</sub>](https://github.com/ArianeKedma) |
| :---: | :---: |

