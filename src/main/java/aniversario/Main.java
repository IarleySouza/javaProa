package aniversario;

public class Main {
    public static void main(String[] args) {
        FestaDeAniversarioConcreto festa = new FestaDeAniversarioConcreto();
        festa.setTema("Festa Tropical");
        festa.setLocal("Salão de Festas");
        festa.setNumeroConvidados(50);
        festa.setComidaInclusa(true);
        festa.setData("25/12/2024");

        // Exibindo as informações da festa
        festa.exibirInformacoes();
    }
}
