import java.util.Scanner;

public class EX05 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println(" Seu objetivo é 500 reais");
        IO.println(" quanto voce guardou?");
        double guardado;
        guardado = sc.nextDouble();
        if (guardado >= 500) {
            IO.println(" sua meta foi atingida e voce guardou mais");
        } else if (guardado <=500){
        IO.println("sua meta não foi atiginda ");
            IO.println(guardado - 500);
            }
        }
    }

