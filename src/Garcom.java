public class Garcom extends Funcionario {
    private int mesasAtendidas;
    private float gorjeta;

    public Garcom(int mesasAtendidas, float gorjeta, String cargo, float salario, String nome, int idade) {
        super(cargo, salario, nome, idade);
        this.mesasAtendidas = mesasAtendidas;
        this.gorjeta = gorjeta;
    }

    public Garcom() {

    }

    public int getMesasAtendidas() {
        return this.mesasAtendidas;
    }

    public void setMesasAtendidas(int mesasAtendidas) {
        this.mesasAtendidas = mesasAtendidas;
    }

    public float getGorjeta() {
        return this.gorjeta;
    }

    public void setGorjeta(float gorjeta) {
        this.gorjeta = gorjeta;
    }
    
    public void anotarPedido(int id, Cliente cliente) {
        if (Restaurante.cardapio.isItemValido(id)) {
            System.out.println("Pedido anotado!");
            float precoComida = Restaurante.cardapio.getPrecoPeloId(id);
            float totalGastosAtual = cliente.getTotalGastos();
            cliente.setTotalGastos(totalGastosAtual + precoComida);
        } else {
            System.out.println("Item não encontrado no cardápio.");
        }
    }

}
