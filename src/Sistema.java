
public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nREGISTRO FUNCIONÁRIO");
        System.out.println("1) Cadastrar Gerente ");
        System.out.println("2) Cadastrar Desenvolvedor");
        System.out.println("3) Cadastrar Estagiário");
        System.out.println("4) Procurar Funcionario ");
        System.out.println("5) Listar Todos");
        System.out.println("6) Excluir Funcionario");
        System.out.println("7) Excluir Todos Funcionarios");
        System.out.println("0) Sair");
        System.out.println("Informe uma opção: ");

    }

    public static void verificarOpcao(int op) {

        String nome;
        int matricula;
        String linguagensDominantes;
        int horasTrabalhadas;
        String supervisor;
        int bonusAnual;
        String equipeSobGerencia;
        double salarioBase;
      
    

        switch (op) {
            case 1:
            System.out.println("Novo Gerente: ");
            System.out.println("Informe o nome: ");
            nome = Console.lerString();

            System.out.println("Informe a matricula: ");
            System.out.println("Matricula:");
            matricula = Console.lerInt();

            salarioBase = 2500.0; 

            System.out.println("informe as horas trabalhadas: ");
            horasTrabalhadas = Console.lerInt();

            System.out.print("Bonus Anual de ");
            bonusAnual = Console.lerInt();

            System.out.println("Equipe que gerencia: ");
            equipeSobGerencia = Console.lerString();

            Gerente g = new Gerente(nome, matricula, bonusAnual, equipeSobGerencia, salarioBase);
            

            System.out.println("\nSalario com o bonus: " + g.calcularSalario()  + " Reais");

            Cadastro.cadastrar(g);

            System.out.println("\nGerente cadastrado...");

            System.out.println(g.toString());

            break;

            case 2:
            System.out.println("Novo Desenvolvedor: ");
            System.out.println("Informe o nome: ");
            nome = Console.lerString();

            System.out.println("Informe a matricula: ");
            System.out.println("Matricula:");
            matricula = Console.lerInt();

            salarioBase = 2000.0;

            System.out.println("informe as horas trabalhadas: ");
            horasTrabalhadas = Console.lerInt();


            System.out.println("Equipe que gerencia: ");
            equipeSobGerencia = Console.lerString();

            System.out.println("Linguagens que domina: ");
            linguagensDominantes = Console.lerString();

            Desenvolvedor d = new Desenvolvedor(nome, matricula, linguagensDominantes, salarioBase, horasTrabalhadas);
        

            System.out.println("\nSalario com o bonus: " + d.calcularSalario()  + " Reais");

            Cadastro.cadastrar(d);

            System.out.println("\nDesenvolvedor cadastrado...");

            System.out.println(d.toString());

            break;
            

            case 3:

            System.out.println("Novo Estagiario: ");
            System.out.println("Informe o nome: ");
            nome = Console.lerString();

            System.out.println("Informe a matricula: ");
            System.out.println("Matricula:");
            matricula = Console.lerInt();

            salarioBase = 1000.0;

            System.out.println("Supervisionado por: ");
            supervisor = Console.lerString();

            System.out.println("informe as horas trabalhadas: ");
            horasTrabalhadas = Console.lerInt();

  

           Estagiario e = new Estagiario(nome, matricula, horasTrabalhadas, supervisor, salarioBase);
        

            System.out.println("\nSalario com o bonus: " + e.calcularSalario()  + " Reais");

            Cadastro.cadastrar(e);

            System.out.println("\nEstagiário cadastrado...");

            System.out.println(e.toString());

            break;

            case 4:
                System.out.println("\nProcurar Funcionario: ");

                System.out.println("Informe a matricula: ");
                matricula = Console.lerInt();

                Funcionario f = Cadastro.buscarFuncionario(matricula);

                if (f != null) {
                    System.out.println("\nFuncionario localizado: ");
                    System.out.println(f.toString());
                    return;
                }
                System.out.println("\nFuncionario " + matricula + " não foi encontrado");

                break;

            case 5:
            System.out.println("\nTodos os Funcionarios foram cadastrados");

            if (Cadastro.getListaFuncionarios().size() == 0) {
                System.out.println("\nNão há funcionarios cadastrados");
                return;
            }
        
            for (Funcionario temp : Cadastro.getListaFuncionarios()) {
                System.out.println(temp.toString() + " - Salário: " + temp.calcularSalario());
            }
            break;

            case 6:

                System.out.print("\nInforme a matricula do funcionario que quer excluir: ");
                matricula = Console.lerInt();

                Funcionario f2 = Cadastro.buscarFuncionario(matricula);

                if (f2 == null) {
                    System.out.println("\nFuncionário " + matricula + " não foi encontrado");
                    return;
                }

                Cadastro.excluir(f2);

                System.out.println("\nFuncionário excluído com sucesso!");

                break;

            case 7:

                System.out.println("Excluir Todos Funcionarios");

                if (Cadastro.getListaFuncionarios().size() == 0) {
                    System.out.println("Não há Funcionarios para excluir");
                    return;
                }

                Cadastro.getListaFuncionarios().clear();
                System.out.println("Funcionarios da lista foram excluidos com sucesso");

                break;

            case 0:
                System.out.println("\nO programa foi finalizado");
                break;

            default:

                System.out.println("\nOpção invalida. digite novamente");
                break;
        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);
    }

}
