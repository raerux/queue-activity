public class Fila {
    private int[] array;
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidadeMaxima;
    
    public Fila(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.array = new int[capacidadeMaxima];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }
    
    public void enqueue(int valor) {
        if (tamanho >= capacidadeMaxima) {
            System.out.println("Erro: Fila cheia!");
            return;
        }
        fim = (fim + 1) % capacidadeMaxima;
        array[fim] = valor;
        tamanho++;
        System.out.println("Elemento " + valor + " inserido na fila");
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Erro: Fila vazia!");
            return -1;
        }
        int valorRemovido = array[inicio];
        inicio = (inicio + 1) % capacidadeMaxima;
        tamanho--;
        System.out.println("Elemento " + valorRemovido + " removido da fila");
        return valorRemovido;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Erro: Fila vazia!");
            return -1;
        }
        return array[inicio];
    }
    
    public boolean isEmpty() {
        return tamanho == 0;
    }
    
    public void exibirFila() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return;
        }
        System.out.print("Fila (início -> fim): ");
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % capacidadeMaxima;
            System.out.print(array[indice] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("=== TESTE DA FILA ===");
        
        Fila fila = new Fila(5);
        
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        
        fila.exibirFila();
        
        System.out.println("Primeiro elemento: " + fila.peek());
        
        System.out.println("\nRemoção de todos os elementos:");
        while (!fila.isEmpty()) {
            fila.dequeue();
        }
        
        System.out.println("Fila está vazia? " + fila.isEmpty());
    }
}