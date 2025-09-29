public class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;
    
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1;
    }
    
    public void push(int valor) {
        if (topo >= capacidade - 1) {
            System.out.println("Erro: Pilha cheia! Não é possível inserir " + valor);
            return;
        }
        elementos[++topo] = valor;
        System.out.println("Elemento " + valor + " inserido na pilha");
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia! Não é possível remover elemento");
            return -1;
        }
        int elemento = elementos[topo];
        topo--;
        System.out.println("Elemento " + elemento + " removido da pilha");
        return elemento;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia! Não há elemento no topo");
            return -1;
        }
        return elementos[topo];
    }
    
    public boolean isEmpty() {
        return topo == -1;
    }
    
    public void exibirPilha() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return;
        }
        
        System.out.print("Pilha (do topo para a base): ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRAÇÃO DA CLASSE PILHA ===\n");
        
        Pilha pilha = new Pilha(5);
        
        System.out.println("1. Pilha criada com capacidade 5");
        pilha.exibirPilha();
        
        System.out.println("\n2. Inserindo três valores (10, 20, 30):");
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.exibirPilha();

        System.out.println("\n3. Consultando elemento do topo:");
        System.out.println("Elemento no topo: " + pilha.peek());
        pilha.exibirPilha();
        
        System.out.println("\n4. Removendo todos os elementos:");
        while (!pilha.isEmpty()) {
            pilha.pop();
            pilha.exibirPilha();
        }
        
        System.out.println("\n5. Tentativa de remover de pilha vazia:");
        pilha.pop();
        
        System.out.println("\n6. Verificando se a pilha está vazia:");
        System.out.println("Pilha vazia? " + pilha.isEmpty());
    }
}