public class TestePilhaFila {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO PILHA ===");
        PilhaLinkedList<Integer> pilha = new PilhaLinkedList<>();
        
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        
        System.out.println("Elemento no topo: " + pilha.topo());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
        
        System.out.println("Desempilhando: " + pilha.desempilhar());
        System.out.println("Desempilhando: " + pilha.desempilhar());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
        
        System.out.println("\n=== TESTANDO FILA ===");
        FilaLinkedList<String> fila = new FilaLinkedList<>();
        
        fila.enfileirar("Primeiro");
        fila.enfileirar("Segundo");
        fila.enfileirar("Terceiro");
        
        System.out.println("Primeiro da fila: " + fila.primeiro());
        System.out.println("Tamanho da fila: " + fila.tamanho());
        
        System.out.println("Desenfileirando: " + fila.desenfileirar());
        System.out.println("Desenfileirando: " + fila.desenfileirar());
        System.out.println("Tamanho da fila: " + fila.tamanho());
    }
}