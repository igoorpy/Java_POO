public class Aula1_objeto {
    public static void main(String[] args) {
        // Instanciando o primeiro objeto (c1) a partir da classe Caneta
        Caneta c1 = new Caneta();
        
        // Definindo os valores dos atributos do objeto c1
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        
        c1.tampar();    // Chama o método para tampar a caneta
        c1.status();    // Exibe o estado atual da caneta
        c1.rabiscar();  // Tenta rabiscar (vai dar erro porque tá tampada)

        System.out.println("\n------------------------------\n");

        // Instanciando um SEGUNDO objeto (c2) totalmente independente
        Caneta c2 = new Caneta();
        c2.modelo = "Faber-Castell";
        c2.cor = "Vermelha";
        c2.ponta = 1.0f;
        c2.carga = 50;
        
        c2.destampar(); // Destampa a caneta c2
        c2.status();
        c2.rabiscar();  // Vai rabiscar
    }
}