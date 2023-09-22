//  Situação: Sistema de Cadastro em Plataforma Digital.
//   Descrição: Inscrições de Clientes na Plataforma.

package ENTREGA02;

import javax.swing.*;

public class Teste {
    public static void main (String[] args) throws Exception {

        Vetor vetor = new Vetor(5);

        JOptionPane.showInternalMessageDialog(null, "----- Seja Bem Vindo ao TEC+ -----");

        Cadastro(vetor);

        int Quant = JOptionPane.showConfirmDialog(null, "Desejar visualizar o suas informações?");

        if (Quant == 0) {
            JOptionPane.showInternalMessageDialog(null, vetor.toString());
        }

        int Excluir = JOptionPane.showConfirmDialog(null, "Desejar excluir o seu cadastro?");

        if (Excluir == 0) {
            vetor.Deletar(0);

            JOptionPane.showInternalMessageDialog(null, "Exclusão realizada.");

            JOptionPane.showInternalMessageDialog(null, "Obrigado por utilizar nosso serviços!");

        }

        else {
            JOptionPane.showInternalMessageDialog(null, "Obrigado por utilizar nosso serviços!");
        }
    }

    public static void Cadastro (Vetor vetor) {

        JOptionPane.showInternalMessageDialog(null, "Preencha as informações abaixo para realizar o cadastro: ");

        int id = 0;

        String nome = JOptionPane.showInputDialog("Insira o Nome: ");
        String nomeEmpresa = JOptionPane.showInputDialog("Insira o Nome da Empresa: ");
        String email = JOptionPane.showInputDialog("Insira o E-mail: ");
        String telefone = JOptionPane.showInputDialog("Insira o número de telefone: ");

        CadastrarClientes M1 = new CadastrarClientes(id, nome, nomeEmpresa, email, telefone );

        try {
            vetor.Adiciona(M1);
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        JOptionPane.showInternalMessageDialog(null, "Cadastro Realizado.");
    }
}


