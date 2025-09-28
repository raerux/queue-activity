import java.util.LinkedList;

public class PilhaLinkedList<T> {
    private LinkedList<T> lista;

    public PilhaLinkedList() {
        this.lista = new LinkedList<>();
    }

    public void empilhar(T elemento) {
        lista.addFirst(elemento);
    }

    public T desempilhar() {
        if (lista.isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return lista.removeFirst();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public T topo() {
        if (lista.isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return lista.getFirst();
    }

    public int tamanho() {
        return lista.size();
    }
}