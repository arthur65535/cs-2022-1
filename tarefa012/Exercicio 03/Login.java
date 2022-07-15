import java.util.Objects;

public class Login {
    private String usuario;
    private String senha;

    public boolean FazerLogin(String usuario, String senha) throws LoginInvalidoException{
        if ((!Objects.equals(this.usuario, usuario)) || (!Objects.equals(this.senha, senha))){
            throw new LoginInvalidoException("Dados incorretos.\n");
        } else {
            return true;
        }
    }
}
