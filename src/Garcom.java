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
        Comida comidaPedido = Restaurante.cardapio.getComidaPeloId(id);
        if (comidaPedido != null) {
            System.out.println("Pedido anotado!");

            mesasAtendidas += 1;
            float precoComida = comidaPedido.getPreco();
            float totalGastosAtual = cliente.getTotalGastos();
            cliente.setTotalGastos(totalGastosAtual + precoComida);

            cliente.setComanda(comidaPedido);
            notificarCozinheiro(comidaPedido);
            cliente.setFezPedido(true);
        } else {
            System.out.println("Item não encontrado.");
        }
    }

    public void notificarCozinheiro(Comida comida) {
        Restaurante.cozinheiro.cozinhar(comida);
    }

}
