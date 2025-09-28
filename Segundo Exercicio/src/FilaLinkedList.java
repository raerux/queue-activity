import java.util.LinkedList;
import java.util.NoSuchElementException;

public class FilaLinkedList<T> {
    private LinkedList<T> fila;
    
    public FilaLinkedList() {
        this.fila = new LinkedList<>();
    }
    
    public void enfileirar(T elemento) {
        fila.addLast(elemento);
    }
    
    public T desenfileirar() {
        if (fila.isEmpty()) {
            throw new NoSuchElementException("Fila vazia");
        }
        return fila.removeFirst();
    }
    
    public T primeiro() {
        if (fila.isEmpty()) {
            throw new NoSuchElementException("Fila vazia");
        }
        return fila.getFirst();
    }
    
    public boolean estaVazia() {
        return fila.isEmpty();
    }
    
    public int tamanho() {
        return fila.size();
    }
    
    @Override
    public String toString() {
        return "Fila: " + fila.toString();
    }
}