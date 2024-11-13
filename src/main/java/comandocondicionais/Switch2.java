package comandocondicionais;
import java.util.Scanner;


public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para saber seu mês: ");
        int valor = sc.nextInt();
        String mensagem = "";

        switch (valor) {
            case 1: mensagem = "Janeiro";
            break;
            case 2: mensagem = "Fevereiro";
            break;
            case 3: mensagem = "Marco";
            break;
            case 4: mensagem = "Abril";
            break;
            case 5: mensagem = "Maio";
            break;
            case 6: mensagem = "Junho";
            break;
            case 7: mensagem = "Julho";
            break;
            case 8: mensagem = "Agosto";
            break;
            case 9: mensagem = "Setembro";
            break;
            case 10: mensagem = "Outubro";
            break;
            case 11: mensagem = "Novembro";
            break;
            case 12: mensagem = "Dezembro";
            break;
            default: mensagem = "Erro! não existe esse mês.";
        }
        System.out.println(mensagem);
    }
}
