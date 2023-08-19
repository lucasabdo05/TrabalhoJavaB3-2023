public class Funcionario extends Pessoa {
    private float salario;
    private String cargo;


    public Funcionario(String cargo, float salario, String nome, int idade) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }


    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
