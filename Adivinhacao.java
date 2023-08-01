import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int suasTentativas = 0;

        while (suasTentativas < 5){
            System.out.println("escolha um numero entre 0 e 100");
            int numeroDigitado = leitor.nextInt();
            suasTentativas++;

            if (numeroGerado == numeroDigitado){
                System.out.println("Você acertou o número! :D");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número gerado é menor do que o número gerado");
            } else {
                System.out.println("O número gerado é maior do que o número gerado");
            }
        }

        if (suasTentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroGerado);
        }

    }

    }

