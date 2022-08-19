public class Main {
    public static void main(String[] args) {
        
        String login = "joao255?";
        String senha = "Jacare800?";
        
        //Verifica Login ------------------------------------------------------------------------

        //O "." procura qualquer caractere, e os "{5,30}" pelo menos 5 mas nao mais que 30 vezes.
        //Se true, passa a procurar letras, numeros e caracteres especiais. Se false, mensagem.
        boolean VerificaLogin = login.matches(".{5,30}");
        
        if (VerificaLogin == true){
            int confirma = 0;//variavel determinante contadora

            VerificaLogin = login.matches("\w");//O "\w" busca letras e numeros
            if (VerificaLogin == true){
                confirma++;
            }
            VerificaLogin = login.matches("\D");//O "\D" busca nao numeros, confirma letras
            if (VerificaLogin == true){
                confirma++;
            }
            VerificaLogin = login.matches("\W");//O "\W" busca especiais
            if (VerificaLogin == true){
                confirma++;
            }

            if (confirma == 3){
                System.out.println("Login valido.");
            } else {
                System.out.println("Login invalido.");
            }
        } else {
            System.out.println("Login invalido.");
        }

        //Verifica senha ------------------------------------------------------------------------

        //O "." procura qualquer caractere, e o "{8,12}" pelo menos 8 mas nao mais que 12 vezes.
        //Se true, passa a procurar letras, numeros, caracteres especiais e 
        boolean VerificaSenha = senha.matches(".{8,12}");

        if(VerificaSenha == true){
            int confirma = 0;//variavel determinante contadora

            VerificaSenha = senha.matches("\w");//busca letras e numeros
            if (VerificaSenha == true){
                confirma++;
            }
            VerificaSenha = senha.matches("\D");//busca nao numeros e confirma letras
            if (VerificaSenha == true){
                confirma++;
            }
            VerificaSenha = senha.matches("\W");//busca caracteres especiais
            if (VerificaSenha == true){
                confirma++;
            }
            VerificaSenha = senha.matches("[A-Z]+");//busca maiusculas
            if (VerificaSenha == true){
                confirma++;
            }

            if (confirma == 4){
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }

        } else {
            System.out.println("Senha invalida.");
        }
    }
}
