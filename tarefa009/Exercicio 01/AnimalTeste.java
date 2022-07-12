package exercicio01;

public class AnimalTeste {
    Cachorro cac = new Cachorro();
    Cavalo cav = new Cavalo();
    Preguica pre = new Preguica();

    //invocacao setters
    cac.setNome("Romeu");
    cac.setIdade(1);
    cac.setPelo("Marrom"); 

    cav.setNome("Spirit");
    cav.setIdade(3);
    cav.setPelo("Beige");

    pre.setNome("Maike");
    pre.setIdade(2);
    pre.setPelo("Cinza");

    //invocacao metodos
    cac.emitirSom();

    cav.emitirSom();

    pre.emitirSom();
}