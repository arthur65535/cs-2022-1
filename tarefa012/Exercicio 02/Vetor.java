import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;

public class Vetor {
    int num[] = new int[10], n, i;
    Scanner scan = new Scanner(System.in);

    public void PreencheVetor(){
        while (n != 0){
            try {
                n = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ops... você digitou caracteres.");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Ops... passou do limite do vetor.");
            } finally {
                n = 0;
            }
            num[i] = n;
            i++;
        }
    }
    
}
