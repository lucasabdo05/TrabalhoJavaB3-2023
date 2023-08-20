public class Cozinheiro extends Funcionario {
    private int pratosPreparados;

    public Cozinheiro(int pratosPreparados, String cargo, float salario, String nome, int idade) {
        super(cargo, salario, nome, idade);
        this.pratosPreparados = pratosPreparados;
    }
    
    public Cozinheiro() {
        
    }

    public int getPratosPreparados() {
        return this.pratosPreparados;
    }

    public void setPratosPreparados(int pratosPreparados) {
        this.pratosPreparados = pratosPreparados;
    }

}
