import java.util.Scanner;

public class EX02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite seu Nome");
        String nome;
        nome = sc.next();
        IO.println(" Digite o prato desejado");
        String prato;
        prato = sc.next();
        IO.println(" Digite o Valor");
        double valor = sc.nextDouble();
        IO.println(" Resumo do Pedido");
        IO.println("Nome:" + nome);
        IO.println("Prato:" + prato);
        IO.println("Valor:" + valor );
    }
}
