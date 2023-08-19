public class Caixa extends Funcionario {
    private int totalVendas;


    public Caixa(int totalVendas, String cargo, float salario, String nome, int idade) {
        super(cargo, salario, nome, idade);
        this.totalVendas = totalVendas;
    }


    public int getTotalVendas() {
        return this.totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }
    
}
