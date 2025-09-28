public class EditorTexto {
    private Pilha<String> acoes;
    private String textoAtual;
    
    public EditorTexto() {
        acoes = new Pilha<>();
        textoAtual = "";
    }
    
    public void escrever(String texto) {
        acoes.empilhar(textoAtual);
        textoAtual += texto;
    }
    
    public void desfazer() {
        if (!acoes.vazia()) {
            textoAtual = acoes.desempilhar();
        }
    }
    
    public String getTexto() {
        return textoAtual;
    }
    
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        
        editor.escrever("Olá ");
        System.out.println(editor.getTexto());
        
        editor.escrever("mundo!");
        System.out.println(editor.getTexto());
        
        editor.desfazer();
        System.out.println(editor.getTexto());
        
        editor.desfazer();
        System.out.println(editor.getTexto());
    }
}