import java.util.Scanner;

public class EX01 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("digite seu nome");
        String  nome;
        nome = sc.next();
        IO.println("curso que está matriculado");
        String curso;
        curso = sc.next();
        IO.println("qual sua idade");
        int idade = sc.nextInt();
        IO.println("suas informações");
        IO.println( "Seu nome: " + nome );
        IO.println("Sua idade: " + idade);
        IO.println("Seu curso: " + curso);
       
    }
}

