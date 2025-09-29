import java.util.*;

public class TaskManager {
    private Queue<Task> normalTasks;
    private Stack<Task> priorityTasks;
    
    public TaskManager() {
        this.normalTasks = new LinkedList<>();
        this.priorityTasks = new Stack<>();
    }
    
    public void addTask(String name, String description, boolean isPriority) {
        Task task = new Task(name, description, isPriority);
        
        if (isPriority) {
            priorityTasks.push(task);
            System.out.println("✓ Tarefa prioritária adicionada à PILHA: " + task.getName());
        } else {
            normalTasks.offer(task);
            System.out.println("✓ Tarefa normal adicionada à FILA: " + task.getName());
        }
    }
    
    public Task executeNextTask() {
        Task nextTask = null;
        
        if (!priorityTasks.isEmpty()) {
            nextTask = priorityTasks.pop();
            System.out.println("Executando tarefa prioritária da PILHA: " + nextTask.getName());
        } 
        else if (!normalTasks.isEmpty()) {
            nextTask = normalTasks.poll();
            System.out.println("▶Executando tarefa normal da FILA: " + nextTask.getName());
        } 
        else {
            System.out.println("Nenhuma tarefa para executar!");
            return null;
        }
        
        return nextTask;
    }
    
    public void showStatus() {
        System.out.println("\nSTATUS DO SISTEMA:");
        System.out.println("Tarefas prioritárias na PILHA: " + priorityTasks.size());
        if (!priorityTasks.isEmpty()) {
            System.out.println("   Próxima: " + priorityTasks.peek().getName());
        }
        
        System.out.println("Tarefas normais na FILA: " + normalTasks.size());
        if (!normalTasks.isEmpty()) {
            System.out.println("   Próxima: " + normalTasks.peek().getName());
        }
        System.out.println();
    }
    
    public void listAllTasks() {
        System.out.println("\nTODAS AS TAREFAS PENDENTES:");
        
        if (!priorityTasks.isEmpty()) {
            System.out.println("PILHA (Prioritárias - LIFO):");
            Stack<Task> temp = new Stack<>();
            int position = priorityTasks.size();
            
            while (!priorityTasks.isEmpty()) {
                Task task = priorityTasks.pop();
                System.out.println("   " + position + ". " + task);
                temp.push(task);
                position--;
            }
            
            while (!temp.isEmpty()) {
                priorityTasks.push(temp.pop());
            }
        }
        
        if (!normalTasks.isEmpty()) {
            System.out.println("FILA (Normais - FIFO):");
            int position = 1;
            for (Task task : normalTasks) {
                System.out.println("   " + position + ". " + task);
                position++;
            }
        }
        
        if (priorityTasks.isEmpty() && normalTasks.isEmpty()) {
            System.out.println("   Nenhuma tarefa pendente!");
        }
        System.out.println();
    }
}