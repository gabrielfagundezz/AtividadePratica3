public class Gerente extends Funcionario{

    private double bonusAnual;
    private String equipeSobGerencia;

    public Gerente(){

    }

    public Gerente(double bonusAnual, String equipeSobGerencia) {
        this.bonusAnual = bonusAnual;
        this.equipeSobGerencia = equipeSobGerencia;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + bonusAnual;
    }

    
    

}
