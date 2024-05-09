public class Estagiario extends Funcionario {

    private int horasTrabalho;
    private String supervisor;

    public Estagiario(){

    }

    public Estagiario(String nome, int matricula, double salario, int horasTrabalho, String supervisor) {
        super(nome, matricula, salario);
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

    public void supervisor(){
        System.out.println("Supervisor: " + supervisor);
    }

    
}
