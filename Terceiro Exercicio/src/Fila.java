import java.util.LinkedList;

public class Fila<T> {
    private LinkedList<T> lista;
    
    public Fila() {
        lista = new LinkedList<>();
    }
    
    public void enfileirar(T elemento) {
        lista.addLast(elemento);
    }
    
    public T desenfileirar() {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.removeFirst();
    }
    
    public boolean vazia() {
        return lista.isEmpty();
    }
    
    public int tamanho() {
        return lista.size();
    }
}