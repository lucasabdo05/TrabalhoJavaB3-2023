import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private float dinheiro;
    private float totalGastos;
    private List<Comida> comanda;


    public Cliente(float dinheiro, float totalGastos, String nome, int idade) {
        super(nome, idade);
        this.dinheiro = dinheiro;
        this.totalGastos = totalGastos;
        comanda = new ArrayList<>();
    }

    public Cliente() {
        comanda = new ArrayList<>();
    }

    public float getDinheiro() {
        return this.dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public float getTotalGastos() {
        return this.totalGastos;
    }

    public void setTotalGastos(float totalGastos) {
        this.totalGastos = totalGastos;
    }

    public void fazerPedido(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        int id;

        id = scanner.nextInt();

        Restaurante.garcom.anotarPedido(id, cliente);
    }

    public void adicionarItemComanda(Comida comida) {
        comanda.add(comida);
    }

    public void imprimirComanda() {
        System.out.println("Comanda:");
        for (Comida comida : comanda) {
            System.out.println(comida.getNome() + " - " + comida.getPreco() + "$");
        }
        System.out.println("Total - " + getTotalGastos());
    }
}
