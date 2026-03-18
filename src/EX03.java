import java.util.Scanner;

public class EX03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite seu NickName");
        String NickName;
        NickName = sc.next();
        IO.println("Digite seu Jogo Favorito");
        String JogoFavorito;
        JogoFavorito = sc.next();
        IO.println("Digite sua Pontuação mais Recente");
        double pontuacão = sc.nextDouble();
        IO.println(" Informações do Perfil");
        IO.println("NickName: " + NickName);
        IO.println("Jogo Favorito: " + JogoFavorito);
        IO.println("Pontuação: " + pontuacão );
    }
}
