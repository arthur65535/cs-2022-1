import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args){
        int opc, opc2;
        ArrayList<Produto> carrinho = new ArrayList<>();
        
        do {
            //apresentacao e captacao do menu
            System.out.println("Carrinho de compras\nDigite uma opcao:\n1 - Inserir Produto\n2 - Ver Produtos\n0 - Sair\n");
            Scanner sc1 = new Scanner(System.in);
            opc = sc1.nextInt();

            //execucao do menu
            if (opc == 1){
                //submenu add produto
                System.out.println("Digite o produto:\n1 - Mouse\n2 - Livro\n");
                opc2 = sc1.nextInt();
                
                //executa acao
                if (opc2 == 1){
                    Mouse ms = new Mouse("Birl");
                    carrinho.add(ms);
                } else if (opc2 == 2){
                    Livro lv = new Livro("Birl");
                    carrinho.add(lv);
                } else {
                    break;
                }
            } else if (opc == 2){
                //lista todos os produtos do carrinho
                for (int i; i < carrinho.size(); i++){
                    System.out.println(carrinho.get(i).descricao);
                }
            } else {
                break;
            }
            //saida do menu
        } while (opc != 0);
    }
}
