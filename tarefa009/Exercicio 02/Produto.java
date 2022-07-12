public class Produto {
    private String nomeLoja;
    private float preco;
    protected String descricao = "Produto de Informatica";
    
    public String getDescricao() {
        return descricao;
    }
    public String getNomeLoja() {
        return nomeLoja;
    }
    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}