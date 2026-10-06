public class Caneta {
    // ATRIBUTOS (Características da caneta)
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    // MÉTODOS (Ações que a caneta pode fazer)
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar, a caneta está tampada.");
        } else {
            System.out.println("Rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}