public class Mouse extends Produto{
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Mouse(String descricao) {
        descricao = "Mouse otico, Saida USB, 1600 dpi";
        this.descricao = descricao;
    }
    
    @Override
    public String getDescricao(){
        String desc = (descricao + tipo);
        return desc;
    }
}
