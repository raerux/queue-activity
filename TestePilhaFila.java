public class TestePilhaFila {
    public static void main(String[] args) {
        // Testando a Pilha
        System.out.println("=== TESTANDO PILHA ===");
        PilhaLinkedList<Integer> pilha = new PilhaLinkedList<>();

        // Empilhando elementos
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        System.out.println("Elemento no topo: " + pilha.topo());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());

        // Desempilhando elementos
        System.out.println("Desempilhando: " + pilha.desempilhar());
        System.out.println("Desempilhando: " + pilha.desempilhar());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());

        System.out.println("\n=== TESTANDO FILA ===");
        FilaLinkedList<String> fila = new FilaLinkedList<>();

        // Enfileirando elementos
        fila.enfileirar("Primeiro");
        fila.enfileirar("Segundo");
        fila.enfileirar("Terceiro");

        System.out.println("Primeiro da fila: " + fila.primeiro());
        System.out.println("Tamanho da fila: " + fila.tamanho());

        // Desenfileirando elementos
        System.out.println("Desenfileirando: " + fila.desenfileirar());
        System.out.println("Desenfileirando: " + fila.desenfileirar());
        System.out.println("Tamanho da fila: " + fila.tamanho());
    }
}