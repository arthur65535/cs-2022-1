package exercicio01;
public class Zoologico {
    int i;
    String loc;
    Animal[] jaulas;
    jaulas = new Animal[10];

    jaulas[0] = new Cachorro();
    jaulas[1] = new Cavalo();
    jaulas[2] = new Preguica();
    jaulas[3] = new Cachorro();
    jaulas[4] = new Cachorro();
    jaulas[5] = new Cavalo();
    jaulas[6] = new Preguica();
    jaulas[7] = new Cachorro();
    jaulas[8] = new Cachorro();
    jaulas[9] = new Cavalo();

    for (i : jaulas){
        System.out.println(jaulas[i].emitirSom());
        System.out.println(jaulas[i].locomover());
        System.out.println("\n");
    }

    return 0;
}
