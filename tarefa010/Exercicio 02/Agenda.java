import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.SourceDataLine;
public class Agenda {
    //declara lista de contatos
    List<Contato> lista = new ArrayList<Contato>();

    public void AddContato(Contato c1){
        lista.add(c1);
    }

    public Contato buscarContato(String nome, String email){
        Contato c1 = new Contato();
        
        //folheia a lista atras do contato e testa nome e email
        for(int i = 0; i < lista.size(); i++){
            c1 = lista.get(i);

            //compara nome e email informado com da lista
            if ((c1.getNome() == nome) || (c1.getEmail() == email)){
                //se achou retorna o objeto
                return c1;
            }
        }
        //se não achou, avisa e retorna null
        System.out.println("Contato não encontrado.\n");
        return null;
    }

    public void excluirContato(String nome){
        Contato c1 = new Contato();
        
        //folheia a lista atras do contato e testa nome
        for(int i = 0; i < lista.size(); i++){
            c1 = lista.get(i);

            //compara nome informado com da lista
            if (c1.getNome() == nome){
                //se achou exclui o objeto da lista
                lista.remove(i);
            }
        }
        //se não achou, nada acontece feijoada
    }

    public void listarContatos(){
        Contato c1 = new Contato();

        //folheia a lista e printa tudo
        for(int i = 0; i < lista.size(); i++){
            c1 = lista.get(i);

            System.out.println(c1.getNome() + "\n" + c1.getEmail() + "\n\n");
        }
    }
}
