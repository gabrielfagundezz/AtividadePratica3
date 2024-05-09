public class Desenvolvedor extends Funcionario {

    private String tecnologias;
    private int horasTrabalhadas;

    public Desenvolvedor(String tecnologias, int horasTrabalhadas) {
        this.tecnologias = tecnologias;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + (50.00 * horasTrabalhadas); // cada hora trabalhada são 50 reais a mais no salário
    }

    @Override
    public String trabalhar() {
        return "O Desenvolvedor " + getNome() + " trabalhou!";
    }

    @Override
    public String relatarProgresso() {
        return "O Desenvolvedor " + getNome() + " relatou progresso!";
    }


}
