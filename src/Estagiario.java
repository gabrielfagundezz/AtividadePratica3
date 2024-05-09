public class Estagiario extends Funcionario {

    private int horasTrabalho;
    private String supervisor;

    public Estagiario(){

    }

    public Estagiario(int horasTrabalho, String supervisor) {
        this.horasTrabalho = horasTrabalho;
        this.supervisor = supervisor;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + (28.00 * horasTrabalho) ; // 28 reais a mais por hora trabalhada
    }

    @Override
    public String trabalhar() {
        return "O Estagiário " + getNome() + " trabalhou!";
    }

    @Override
    public String relatarProgresso() {
        return "O Estagiário " + getNome() + " relatou progresso!";
    }

    
}
