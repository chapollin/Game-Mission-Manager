🕹️ Padrão de Projeto Singleton — Exemplo: Gerenciador de Missões de um Jogo

Este repositório apresenta o estudo e a implementação do padrão de projeto Singleton, um dos padrões criacionais mais conhecidos na engenharia de software.
O objetivo é compreender o problema que ele resolve, explicar a solução proposta e demonstrar seu uso em um exemplo funcional: um Gerenciador de Missão de um jogo.

1. 🧩 Problema que o padrão Singleton resolve
Em muitos sistemas, existe a necessidade de garantir que apenas uma instância de uma classe seja criada durante toda a execução. Isso ocorre quando o sistema precisa que diferentes partes compartilhem o mesmo estado centralizado.

📌 Problema Real no Contexto do Exemplo

Em jogos, diversas partes precisam saber:

Qual missão o jogador está realizando;

Qual objetivo da missão deve ser executado;

Se a missão já foi concluída;

Quando desbloquear recompensas ou cutscenes.

Se cada módulo do jogo criasse sua própria instância do Mission Manager, surgiriam problemas:

❌ Inconsistências de estado
Cada sistema (HUD, NPCs, Combate, Save/Load) poderia acreditar que o jogador está em uma missão diferente.

❌ Progresso duplicado ou perdido
Dois módulos poderiam tentar avançar a missão simultaneamente.

❌ Erros ao salvar e carregar o jogo
O sistema poderia salvar um estado e carregar outro completamente diferente.

❌ bugs difíceis de rastrear
Com múltiplas instâncias, cada parte teria sua própria versão da “verdade” sobre o progresso.
Por isso, é necessário um único gerenciador central, garantindo consistência no fluxo do jogo.

2. 🛠️ Solução proposta pelo padrão Singleton
O padrão Singleton resolve o problema garantindo que:

✔ Apenas uma instância pode existir
O construtor da classe é privado, impedindo que outras partes criem objetos diretamente.

✔ O acesso à instância é global e controlado
A classe oferece um método público estático (ex.: getInstance()) que retorna sempre a mesma instância.

✔ O estado é centralizado
Todos os módulos compartilham exatamente os mesmos dados.

✔ Segurança e consistência
Em sistemas maiores, é possível adicionar mecanismos de thread-safety para evitar múltiplas instâncias em ambientes concorrentes.

3. 📘 Diagrama Genérico (UML)
Abaixo, o diagrama representando a estrutura básica de um Singleton — adaptado ao exemplo MissionManager.

    classDiagram
        class MissionManager {
            - static MissionManager instance
            - MissionManager()
            + static getInstance() MissionManager
            + startMission(mission)
            + getCurrentMission() Mission
            + advanceObjective()
            + completeMission()
        }
