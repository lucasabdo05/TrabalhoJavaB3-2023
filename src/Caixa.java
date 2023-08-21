public class Caixa extends Funcionario {
    private int totalVendas;
    private float caixaRestaurante;

    public Caixa(int totalVendas, String cargo, float salario, String nome, int idade) {
        super(cargo, salario, nome, idade);
        this.totalVendas = totalVendas;
    }

    public Caixa() {
        
    }

    public int getTotalVendas() {
        return this.totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getCaixaRestaurante() {
        return this.caixaRestaurante;
    }

    public void setCaixaRestaurante(float caixaRestaurante) {
        this.caixaRestaurante = caixaRestaurante;
    }

    public void receberPagamento(Cliente cliente, float clienteGastos) {
        caixaRestaurante += clienteGastos;
        totalVendas += 1;
        System.out.println(cliente.getNome() + ", seu pagamento foi recebido com sucesso!");
        cliente.setFezPagamento(true);
    }
}
