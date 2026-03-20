import java.util.Scanner;

public class EX07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero;
        IO.println("Me diga sua nota");
        numero = sc.nextInt();

        if (numero >= 7) {
            IO.println(" voce foi provado");
        } else {
            if (numero <= 7) {
                IO.println("voce foi reprovado");
            }
        }
    }
}

