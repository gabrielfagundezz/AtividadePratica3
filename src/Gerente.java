public class Gerente extends Funcionario{

    private double bonusAnual;
    private String equipeSobGerencia;

    public Gerente(){

    }

    public Gerente(String nome, int matricula, double salario, double bonusAnual, String equipeSobGerencia) {
        super(nome, matricula, salario);
        this.bonusAnual = bonusAnual;
        this.equipeSobGerencia = equipeSobGerencia;
    }



    @Override
    public double calcularSalario() {
        return getSalario() + bonusAnual;
    }

    @Override
    public String trabalhar() {
        return "O Gerente " + getNome() + " trabalhou!";
    }

    @Override
    public String relatarProgresso() {
        return "O Gerente " + getNome() + " trabalhou!";
    }

    
    

}
