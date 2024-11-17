package Telefone;

public class TelefoneCelular {

    private String modelo;
    private String marca;
    private String cor;
    private int capacidadeArmazenamento;
    private boolean ligado;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Capacidade de Armazenamento: " + capacidadeArmazenamento + "GB");
        System.out.println("Está ligado: " + (ligado ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        TelefoneCelular tel = new TelefoneCelular();
        tel.setModelo("S");
        tel.setMarca("G");
        tel.setCor("C");
        tel.setCapacidadeArmazenamento(1);
        tel.setLigado(true);
        tel.exibirInfo();
    }
}
