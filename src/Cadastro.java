import java.util.ArrayList;

public class Cadastro {

    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrarFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    public static ArrayList<Funcionario> listarFuncionario(){
        return listaFuncionarios;
    }

}
