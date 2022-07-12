package exercicio01;

public class Cavalo extends Animal {
    private String corPelo;
    
    //setters e getters
    public void setPelo(String pelo){
        this.corPelo = pelo;
    }
    public String getPelo(){
        return corPelo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    //outros metodos
    @Override
    public void locomover(){
        System.out.println("Correndo\n");
    }
    @Override
    public void emitirSom(){
        System.out.println("Relincho\n");
    }
}