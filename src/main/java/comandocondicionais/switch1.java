package comandocondicionais;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero:");
    int numero = entrada.nextInt();
        String mens;

        switch(numero) {
            case 1: mens = "Farol verde! Siga!";
            break;
            case 2: mens = "Farol amarelo! Ateção, reduza a velocidade!";
            break;
            case 3: mens = "Farol vemelho! Pare";
            break;
            default: mens = "Numero inválido";
        }
        System.out.println(mens);

    }

}
