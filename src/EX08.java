import java.util.Scanner;

public class EX08 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int idade;
        IO.println("Qual sua idade?");
        idade = sc.nextInt();

        if (idade >= 18) {
            IO.println("entrada permitida");
        } else {
            if (idade < 18) {
                IO.println("entrada negada");
            }
        }
    }
}

