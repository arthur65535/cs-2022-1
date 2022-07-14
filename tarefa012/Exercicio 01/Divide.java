import java.util.Scanner;
import java.util.InputMismatchException;
public class Divide {
    float n1, n2, res;

    public void dividir() throws InputMismatchException{
        Scanner scan = new Scanner(System.in);
        
        //leem os numeros
        try {
            n1 = scan.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Ops... você digitou caracteres.");
        }
        
        try {
            n2 = scan.nextFloat();
        } catch (InputMismatchException f) {
            System.out.println("Ops... você digitou caracteres.");
        }

        System.out.println(fazDivisao(n1, n2));
    }

    public float fazDivisao(float n1, float n2) throws ArithmeticException{
        if (n2 == 0){//se o divisor for 0
            throw new ArithmeticException("Impossivel dividir por zero.");
        } else {
            return n1 / n2;//retorna o resultado da divisao
        }
    }
}
