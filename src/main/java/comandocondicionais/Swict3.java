package comandocondicionais;

import java.util.Scanner;

public class Swict3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero do seu combo: \n[1] - Family Box para 3\n[2] - Family Box para 2\n[3] - " +
                "Méqui Box Clássico para 4\n[4] - Tasty Turbo\n[5] - Casquinha Super Chocolate\n");

        int x = sc.nextInt();
        String mensagem = "";

        switch (x) {
            case 1: mensagem = "Composto por 01 McLanche Feliz e 02 McOfertas médias Big Mac, Quarterão, Cheddar " +
                    "McMelt ou McChicken Bacon.";
            break;
            case 2: mensagem = "Composto por 01 McLanche Feliz e 01 McOferta média Big Mac, Quarterão, Cheddar McMelt" +
                    " ou McChicken Bacon.";
            break;
            case 3: mensagem = "Méqui Box Clássico para 4 Composto por 04 McOfertas médias: Big Mac, Quarterão, " +
                    "Cheddar McMelt ou McChicken Bacon.";
            break;
            case 4: mensagem = "1 Clássico para 1 pessoa.";
            break;
            case 5: mensagem = "Casquinha Super Chocolate";
            break;
            default: mensagem = "não existe esse combo.";
        }
        System.out.println(mensagem);
    }
}
