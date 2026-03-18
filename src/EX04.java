import java.util.Scanner;

public class EX04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println(" Sua Meta Diáia é 10.000 Passos");
        IO.println("Digite quantos passos voce deu hoje");
        double Passos;
        Passos = sc.nextDouble();
        if (Passos >= 10000) {
            IO.println("Sua Meta foi atingida e voce ultrapassou:");
            IO.println(Passos - 10000);
        } else if (Passos <= 10000){
                IO.println(" sua Meta não foi atingida");

            }
        }

    }
