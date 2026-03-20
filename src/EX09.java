import java.util.Scanner;

public class EX09{
}
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println(" frete gratis a cima de 100 reais");
        IO.println(" digite o valor da sua compra");
        double compra;
        compra = sc.nextDouble();
        if (compra >= 100) {
            IO.println(" parabens voce tem direito a frete gratis");
        } else if (compra <= 100) {
            IO.println("voce não atingiu o valor necessario para conseguir o frete gratis e falta ");
            IO.println(compra - 100);
        }
    }


