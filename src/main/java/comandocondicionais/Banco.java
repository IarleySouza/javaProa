package comandocondicionais;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);

        float credito1, credito2, credito3, credito4, credito5, credito6;
        System.out.print("Digite o 1 salario: ");
        credito1 = banco.nextFloat();
        System.out.print("Digite o 2 salario: ");
        credito2 = banco.nextFloat();
        System.out.print("Digite o 3 salario: ");
        credito3 = banco.nextFloat();
        System.out.print("Digite o 4 salario: ");
        credito4 = banco.nextFloat();
        System.out.print("Digite o 5 salario: ");
        credito5 = banco.nextFloat();
        System.out.print("Digite o 6 salario: ");
        credito6 = banco.nextFloat();

        float saldo = (credito1 + credito2 + credito3 + credito4 + credito5 + credito6) / 6;


        if (saldo <= 500) {
            System.out.println("nenhum credito.");
        } else if (saldo >= 501 && saldo <= 1000) {
            saldo = saldo + (saldo * 0.3f);
            System.out.println(saldo);
        }
        {
            System.out.println("Saldo negativo");
        }
    }
}
