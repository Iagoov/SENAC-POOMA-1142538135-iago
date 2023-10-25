import javax.swing.*;

public class Tarefeiro extends Funcionario{
    private double valorTarefa;
    private int tarefasConcluidas;
    private double salarioLiquido;

    public Tarefeiro() {
        super.setFuncao(this.getClass().getSimpleName());
        this.valorTarefa = 10.00;
    }

    public double getValorTarefa() {
        return valorTarefa;
    }

    public void setValorTarefa() {
        this.valorTarefa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da tarefa (R$): "));;
    }

    public int getTarefasConcluidas() {
        return tarefasConcluidas;
    }

    public void setTarefasConcluidas() {
        this.tarefasConcluidas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de tarefas concluídas: "));

    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = calcSalario();
    }

    public double calcSalario(){
        return getValorTarefa() * getTarefasConcluidas();
    }

    @Override
    public void imprimirHolerite() { // Sobrescreve o método da superclasse para si
        super.imprimirHolerite();
        System.out.println("Valor/tarefa: R$" + valorTarefa + "\nTarefas concluídas: " + tarefasConcluidas + "\nSalário Líquido: R$" + salarioLiquido);
    }
}



