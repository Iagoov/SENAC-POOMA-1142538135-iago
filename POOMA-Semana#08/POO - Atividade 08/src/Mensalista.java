import javax.swing.*;

public class Mensalista extends Funcionario{
    private double valorMes;

    private double salarioLiquido;

    public Mensalista() {
        super.setFuncao(this.getClass().getSimpleName());
        this.valorMes = 1200;
    }

    public double getValorMes() {
        return valorMes;
    }

    public void setValorMes() {
        this.valorMes = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor fixo mensal (R$): "));;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido() {
        this.salarioLiquido = getValorMes();
    }

    @Override
    public void imprimirHolerite() {
        super.imprimirHolerite();
        System.out.println("Valor/mês: R$" + valorMes + "\nSalário Líquido: R$" + valorMes);
    }
}