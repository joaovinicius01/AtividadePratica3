
public class Gerente extends Funcionario implements Trabalhavel {

    private int bonusAnual;
    private String equipeSobGerencia;
    private double salarioBase = 3500.0;


    public Gerente() {

    }
    
    
    
    
    public Gerente(String nome, int matricula, int bonusAnual, String equipeSobGerencia, double salarioBase) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipeSobGerencia = equipeSobGerencia;
        
    }
    
    
    
    
    
    public int getBonusAnual() {
        return bonusAnual;
    }
    
    public void setBonusAnual(int bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
    
    public String getEquipeSobGerencia() {
        return equipeSobGerencia;
    }
    
    public void setEquipeSobGerencia(String equipeSobGerencia) {
        this.equipeSobGerencia = equipeSobGerencia;
    }
    
    @Override
    public String toString() {
        
        return "\nBonus Anual de:  " + bonusAnual + "\nEquipe que gerencia: " + equipeSobGerencia;
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
      
        return salarioBase + bonusAnual;
    }
}