import java.util.LinkedList;

public class FilaLinkedList<T> {
    private LinkedList<T> lista;
    
    public FilaLinkedList() {
        this.lista = new LinkedList<>();
    }
    
    public void enfileirar(T elemento) {
        lista.addLast(elemento);
    }
    
    public T desenfileirar() {
        if (lista.isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return lista.removeFirst();
    }
    
    public boolean isEmpty() {
        return lista.isEmpty();
    }
    
    public T primeiro() {
        if (lista.isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return lista.getFirst();
    }
    
    public int tamanho() {
        return lista.size();
    }
}