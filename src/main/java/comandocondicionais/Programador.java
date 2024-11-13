package comandocondicionais;

import java.util.Scanner;

public class Programador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("O número do código do cargo do funcionário: ");
        int num = entrada.nextInt();

        switch (num) {
            case 1:
                System.out.printf("Programador estagiário - Salário = 1.400 reais. Teve um aumento de: %.2f%n",
                        (1400 * 0.10));
                break;
            case 2:
                System.out.printf("Programador júnior - Salário = 3.000 reais. Teve um aumento de: %.2f%n",
                        (3000 * 0.12));
                break;
            case 3:
                System.out.printf("Programador pleno - Salário = 5.500 reais. Teve um aumento de: %.2f%n", 5500 * 0.13);
                break;
            case 4:
                System.out.printf("Programador sênior - Salário = 8.000 reais. Teve um aumento de: %.2f%n", 8000 * 0.15);
                break;
            case 5:
                System.out.printf("Programador master - Salário = 12.000 reais. Teve um aumento de: %.2f%n", 12000 * 0.18);
                break;
            default:
                System.out.println("Não existe esse funcionário no banco de dados.");
        }
    }
}
