import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        Cliente cliente = new Cliente();
        Garcom garcom = new Garcom(0, 0, "Garçom", 1238.0f, "Dave", 18);
        Cozinheiro cozinheiro = new Cozinheiro(0, "Cozinheiro", 1956.46f, "Lucas", 17);
        Caixa caixa = new Caixa(0, "Caixa", 1616.24f, "Pedro", 18);



        int opcao;
        String nomeRestaurante = "Delícias do Ricardo";
        String nomeCliente;

        System.out.print("Olá, somos do Restaurante " + nomeRestaurante + ", qual é o seu nome? ");
        nomeCliente = scanner.nextLine();
        cliente.setNome(nomeCliente);

        System.out.println(cliente.getNome() + ", aqui está um menu de ações.");
        do {
            break;
        } while(true);
    }
}
