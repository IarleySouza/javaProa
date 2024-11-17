package aniversario;

public abstract class Aniversario {

    private String tema;
    private String local;
    private int numeroConvidados;
    private boolean comidaInclusa;
    private String data;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getNumeroConvidados() {
        return numeroConvidados;
    }

    public void setNumeroConvidados(int numeroConvidados) {
        this.numeroConvidados = numeroConvidados;
    }

    public boolean isComidaInclusa() {
        return comidaInclusa;
    }

    public void setComidaInclusa(boolean comidaInclusa) {
        this.comidaInclusa = comidaInclusa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public abstract void exibirInformacoes();


}
class FestaDeAniversarioConcreto extends Aniversario {

    // Implementação do método abstrato
    @Override
    public void exibirInformacoes() {
        System.out.println("Tema: " + getTema());
        System.out.println("Local: " + getLocal());
        System.out.println("Número de Convidados: " + getNumeroConvidados());
        System.out.println("Comida Inclusa: " + (isComidaInclusa() ? "Sim" : "Não"));
        System.out.println("Data da Festa: " + getData());
    }
}
