public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        
        System.out.println(" SISTEMA DE CONTROLE DE TAREFAS - FILA E PILHA");
        System.out.println("================================================\n");
        
        System.out.println(" Adicionando tarefas normais:");
        taskManager.addTask("Responder emails", "Verificar e responder emails pendentes", false);
        taskManager.addTask("Reunião semanal", "Participar da reunião de equipe", false);
        taskManager.addTask("Relatório mensal", "Preparar relatório de atividades", false);
        
        System.out.println("\n Adicionando tarefas prioritárias:");
        taskManager.addTask("Bug crítico", "Corrigir erro no sistema de pagamento", true);
        taskManager.addTask("Cliente VIP", "Atender solicitação urgente do cliente", true);
        taskManager.addTask("Servidor down", "Investigar problema no servidor principal", true);
        
        taskManager.showStatus();
        taskManager.listAllTasks();
        
        System.out.println("EXECUTANDO TAREFAS:");
        System.out.println("======================");
        
        for (int i = 1; i <= 6; i++) {
            System.out.println("\n--- Execução " + i + " ---");
            Task executedTask = taskManager.executeNextTask();
            if (executedTask != null) {
                System.out.println("Concluída: " + executedTask);
            }
            taskManager.showStatus();
        }
        
        System.out.println("\nEXPLICAÇÃO DA ORDEM DE EXECUÇÃO:");
        System.out.println("====================================");
        System.out.println("1. Tarefas prioritárias são executadas PRIMEIRO (da PILHA)");
        System.out.println("2. Na PILHA (LIFO): a ÚLTIMA tarefa adicionada é a PRIMEIRA a ser executada");
        System.out.println("3. Ordem das prioritárias: Servidor down → Cliente VIP → Bug crítico");
        System.out.println("4. Após esgotar a pilha, executa tarefas da FILA (FIFO)");
        System.out.println("5. Na FILA (FIFO): a PRIMEIRA tarefa adicionada é a PRIMEIRA a ser executada");
        System.out.println("6. Ordem das normais: Responder emails → Reunião semanal → Relatório mensal");
        
        System.out.println("\nJUSTIFICATIVA:");
        System.out.println("=================");
        System.out.println("• PILHA para prioritárias: Tarefas mais recentes são mais urgentes");
        System.out.println("• FILA para normais: Mantém ordem cronológica de chegada");
        System.out.println("• Sistema sempre prioriza pilha sobre fila");
        System.out.println("• Garante que urgências sejam tratadas imediatamente");
    }
}