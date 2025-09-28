import java.util.LinkedList;
import java.util.EmptyStackException;

public class PilhaLinkedList<T> {
    private LinkedList<T> pilha;

    public PilhaLinkedList() {
        this.pilha = new LinkedList<>();
    }

    public void empilhar(T elemento) {
        pilha.addFirst(elemento);
    }

    public T desempilhar() {
        if (pilha.isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.removeFirst();
    }

    public T topo() {
        if (pilha.isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.getFirst();
    }

    public boolean estaVazia() {
        return pilha.isEmpty();
    }

    public int tamanho() {
        return pilha.size();
    }

    @Override
    public String toString() {
        return "Pilha: " + pilha.toString();
    }
}