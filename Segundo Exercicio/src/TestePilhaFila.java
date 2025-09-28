public class TestePilhaFila {
    public static void main(String[] args) {
        System.out.println("=== TESTE DA PILHA ===");
        testePilha();
        
        System.out.println("\n=== TESTE DA FILA ===");
        testeFila();
        
        System.out.println("\n=== TESTE DO EDITOR DE TEXTO ===");
        testeEditorTexto();
    }
    
    public static void testePilha() {
        PilhaLinkedList<String> pilha = new PilhaLinkedList<>();
        
        pilha.empilhar("Primeiro");
        pilha.empilhar("Segundo");
        pilha.empilhar("Terceiro");
        
        System.out.println("Pilha após empilhar: " + pilha);
        System.out.println("Topo da pilha: " + pilha.topo());
        
        System.out.println("Desempilhando: " + pilha.desempilhar());
        System.out.println("Desempilhando: " + pilha.desempilhar());
        
        System.out.println("Pilha final: " + pilha);
        System.out.println("Está vazia? " + pilha.estaVazia());
    }
    
    public static void testeFila() {
        FilaLinkedList<Integer> fila = new FilaLinkedList<>();
        
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        
        System.out.println("Fila após enfileirar: " + fila);
        System.out.println("Primeiro da fila: " + fila.primeiro());
        
        System.out.println("Desenfileirando: " + fila.desenfileirar());
        System.out.println("Desenfileirando: " + fila.desenfileirar());
        
        System.out.println("Fila final: " + fila);
        System.out.println("Tamanho: " + fila.tamanho());
    }
    
    public static void testeEditorTexto() {
        EditorTexto editor = new EditorTexto();
        
        editor.adicionarTexto("Olá ");
        editor.adicionarTexto("mundo");
        editor.adicionarTexto("!");
        
        System.out.println("\n--- Testando Ctrl+Z ---");
        editor.desfazer();
        editor.desfazer();
        
        editor.adicionarTexto("Java");
        editor.desfazer();
        
        System.out.println("\nTexto final: '" + editor.getTexto() + "'");
    }
}