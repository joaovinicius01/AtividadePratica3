public class Desenvolvedor extends Funcionario implements Trabalhavel {

    private String linguagensDominantes;
    private double salarioBase = 2000.0; 
    private double horasTrabalhadas;

    public Desenvolvedor(String linguagensDominantes) {
        this.linguagensDominantes = linguagensDominantes;
    }

    public Desenvolvedor(String nome, int matricula, String linguagensDominantes, double salarioBase,
            double horasTrabalhadas) {
        super(nome, matricula);
        this.linguagensDominantes = linguagensDominantes;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getLinguagensDominantes() {
        return linguagensDominantes;
    }

    public void setLinguagensDominantes(String linguagensDominantes) {
        this.linguagensDominantes = linguagensDominantes;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "\nLinguagens que domina: " + linguagensDominantes;
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor " + getNome() + " trabalhando...");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Progresso relatado pelo desenvolvedor " + getNome());
    }

    public double calcularSalario() {
        return salarioBase * horasTrabalhadas;
    }
}
