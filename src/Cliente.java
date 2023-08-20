public class Cliente extends Pessoa {
    private float dinheiro;
    private float totalGastos;


    public Cliente(float dinheiro, float totalGastos, String nome, int idade) {
        super(nome, idade);
        this.dinheiro = dinheiro;
        this.totalGastos = totalGastos;
    }

    public Cliente() {
        
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
    
}
