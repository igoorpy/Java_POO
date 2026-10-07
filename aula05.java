public class aula05 {
    public static void main(String[] args) {
        // Conta do Jubileu
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Igor");
        p1.abrirConta("CC"); // Ganha R$ 50

        // Conta da Creuza
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Brendo");
        p2.abrirConta("CP"); // Ganha R$ 150

        // Operações de teste
        p1.depositar(300);
        p2.depositar(500);

        p2.sacar(100);

        p1.pagarMensal();
        p2.pagarMensal();

        // Exibe o resumo final das contas
        p1.estadoAtual();
        p2.estadoAtual();
    }
}