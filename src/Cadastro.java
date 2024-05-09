import java.util.ArrayList;

public class Cadastro {

    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrarFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario); 
    }

    public static ArrayList<Funcionario> listarFuncionarios(){
        return listaFuncionarios;
    }

    public static void limparLista(){
        listaFuncionarios.clear();
        System.out.println("A lista foi esvaziada!");
    }

    public ArrayList<Funcionario> buscarPorNome(String nome) {
        ArrayList<Funcionario> funcionariosEncontrados = new ArrayList<>();

        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                funcionariosEncontrados.add(funcionario);
            }
        }

        return funcionariosEncontrados;
    }


}
