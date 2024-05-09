import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Desenvolvedor> devs = new ArrayList<>();
        
        Gerente g = new Gerente("Claus", 2345, 6700.00, 5000, "Equipe 1");
        gerentes.add(g);

        System.out.println(g.trabalhar());
        System.out.println("O salário é de " + g.calcularSalario());

        Desenvolvedor d = new Desenvolvedor("Marco", 1234, 1200, "Java, C#", 45);
        devs.add(d);

        System.out.println(d.trabalhar());
        System.out.println("O salário é de " + d.calcularSalario());
        System.out.println(d.relatarProgresso());



    }
}
