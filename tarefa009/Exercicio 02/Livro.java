public class Livro extends Produto{
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro(String descricao) {
        descricao = "Livro novo, capa dura, 1200 paginas";
        this.descricao = descricao;
    }

    @Override
    public String getDescricao(){
        String desc = (descricao + autor);
        return desc;
    }
}
