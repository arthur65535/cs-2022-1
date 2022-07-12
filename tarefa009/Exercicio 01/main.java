package exercicio01;

public class Teste {
    public static void main (String[] args){
        Cachorro cac = new Cachorro();
        Cavalo cav = new Cavalo();
        Preguica pre = new Preguica();
        Veterinario vet = new Veterinario();

        vet.examinar(cac);
        vet.examinar(cav);
        vet.examinar(pre);
    }
}
