public abstract class Funcionario {
    private String nome;
    private int matricula;
    private double salario;

    // Construtores ----------------
    public Funcionario(){

    }

    public Funcionario(String nome, int matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    // Getters and Setters --------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    // Método calcular salário
    public abstract double calcularSalario();

    
}
