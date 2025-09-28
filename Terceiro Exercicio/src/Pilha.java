import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> lista;
    
    public Pilha() {
        lista = new LinkedList<>();
    }
    
    public void empilhar(T elemento) {
        lista.addFirst(elemento);
    }
    
    public T desempilhar() {
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