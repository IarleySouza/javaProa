package comandocondicionais;
import java.util.Scanner;

public class Votar {
    public static void main(String[] args) {
        Scanner voto = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = voto.nextInt();

        if (idade >= 18 && idade <= 69) {
            System.out.println("Voto obrigatorio.");
        }
        else if (idade >= 16 && idade > 69) {
            System.out.println("Voto opcional.");
        }
        else {
            System.out.println("nao pode votar.");
        }
        voto.close();
    }
}
