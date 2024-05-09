import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static Funcionario buscarFuncionario(int matricula) {
        for (Funcionario temp : listaFuncionarios) {

            if (temp.getMatricula() == matricula) {

                return temp;
            }

        }

        return null;

    }

    public static void excluir(Funcionario f) {
        listaFuncionarios.remove(f);

    }

}
