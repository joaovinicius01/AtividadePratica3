public class Estagiario extends Funcionario implements Trabalhavel {

    private int horasTrabalhadas;
    private String supervisor;
    private double salarioBase = 1500.0;

    
    

   
    

    public Estagiario(String nome, int matricula, int horasTrabalhadas, String supervisor, double salarioBase) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.supervisor = supervisor;

    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

   
    public double calcularSalario() {
        return horasTrabalhadas * salarioBase;
    }

   
    @Override
    public void trabalhar() {
        System.out.println("Estagiário " + getNome() + " trabalhando...");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Progresso relatado pelo estagiário " + getNome() + ":");
        System.out.println("- Tarefas concluídas: Desenvolveu um sistema que faz controle de saida e entrada de veículos de um estacionamento.");
        System.out.println("- Progresso em projetos: Projeto Fluindo Perfeitamente.");
    }

   
    @Override
    public String toString() {
        return "Horas trabalhadas: " + horasTrabalhadas;
    }

    
}
