import java.util.Scanner;

public class EX06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println(" Sua meta é 40 horas");
        IO.println(" quanto voce estudou?");
        double estudou;
        estudou = sc.nextDouble();
        if (estudou >= 40) {
            IO.println(" sua meta foi atingida");
        } else if (estudou <= 40) {
            IO.println("sua meta não foi atiginda e faltou ");
            IO.println(estudou - 40);
        }
    }
}