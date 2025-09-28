public class EditorTexto {
    private PilhaLinkedList<String> historicoAcoes;
    private StringBuilder textoAtual;
    
    public EditorTexto() {
        this.historicoAcoes = new PilhaLinkedList<>();
        this.textoAtual = new StringBuilder();
    }
    
    public void adicionarTexto(String texto) {
        historicoAcoes.empilhar("ADICIONAR:" + texto);
        textoAtual.append(texto);
        System.out.println("Texto adicionado: '" + texto + "'");
        System.out.println("Texto atual: '" + textoAtual.toString() + "'");
    }
    
    public void removerTexto(int quantidade) {
        if (quantidade > textoAtual.length()) {
            quantidade = textoAtual.length();
        }
        
        String textoRemovido = textoAtual.substring(textoAtual.length() - quantidade);
        historicoAcoes.empilhar("REMOVER:" + textoRemovido);
        
        textoAtual.delete(textoAtual.length() - quantidade, textoAtual.length());
        System.out.println("Texto removido: '" + textoRemovido + "'");
        System.out.println("Texto atual: '" + textoAtual.toString() + "'");
    }
    
    public void desfazer() {
        if (historicoAcoes.estaVazia()) {
            System.out.println("Nada para desfazer!");
            return;
        }
        
        String ultimaAcao = historicoAcoes.desempilhar();
        String[] partes = ultimaAcao.split(":", 2);
        String tipoAcao = partes[0];
        String conteudo = partes[1];
        
        switch (tipoAcao) {
            case "ADICIONAR":
                int tamanho = conteudo.length();
                if (tamanho <= textoAtual.length()) {
                    textoAtual.delete(textoAtual.length() - tamanho, textoAtual.length());
                    System.out.println("Desfeito: adição de '" + conteudo + "'");
                }
                break;
                
            case "REMOVER":
                textoAtual.append(conteudo);
                System.out.println("Desfeito: remoção de '" + conteudo + "'");
                break;
        }
        
        System.out.println("Texto atual após desfazer: '" + textoAtual.toString() + "'");
    }
    
    public String getTexto() {
        return textoAtual.toString();
    }
    
    public void limparTexto() {
        historicoAcoes.empilhar("LIMPAR:" + textoAtual.toString());
        textoAtual.setLength(0);
        System.out.println("Texto limpo");
    }
}