package N1;

import javax.swing.*;
import java.util.ArrayList;

public class CadastrarClientes extends Cliente {

    public CadastrarClientes() {
        super();
    }

    public static void CadastraCliente() throws Exception {

        Vetor vetor = new Vetor(5);

        JOptionPane.showInternalMessageDialog(null, "----- Seja Bem Vindo ao TEC+ -----");

        Cadastro(vetor);

        Ferramentas(vetor);
    }

    private static void Cadastro(Vetor vetor) {

        JOptionPane.showInternalMessageDialog(null, "Preencha as informações abaixo para realizar o cadastro: ");

        int id = 0;

        String nome = JOptionPane.showInputDialog("Nome do Representante: ");
        String nomeEmpresa = JOptionPane.showInputDialog("Nome da Empresa: ");
        String telefone = JOptionPane.showInputDialog("Telefone: ");
        String email = JOptionPane.showInputDialog("E-mail: ");
        String senha = JOptionPane.showInputDialog("Senha para Login: ");

        Cliente Novo = new Cliente(id, nome, nomeEmpresa, email, senha, telefone);

        try {
            vetor.Adiciona(Novo);
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        JOptionPane.showInternalMessageDialog(null, "Cadastro Realizado.");
    }

    public static void Ferramentas(Vetor vetor) throws Exception {
        boolean Encerrar = false;

        do {

            int escolha = exibirMenu();

            switch (escolha) {
                case 1:
                    VisualizarCadastro(vetor);
                break;

                case 2:
                    GerenciarAtividades(vetor);

                break;

                case 3:
                    VisualizarEngajamento(vetor);
                break;

                case 4:
                    Deleta(vetor);
                    Encerrar = true;
                break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Conexão Encerrada.");
                    Encerrar = true;
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
            }
        } while (!Encerrar);
    }

    private static int exibirMenu() {
        String menu = "Escolha uma opção:\n" +
                "1 - Visualizar Cadastro\n" +
                "2 - Gerenciar Atividades\n" +
                "3 - Visualizar Engajamento\n" +
                "4 - Deletar Conta\n" +
                "0 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    private static void VisualizarCadastro(Vetor vetor) {
        JOptionPane.showInternalMessageDialog(null, vetor.toString(), "Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void GerenciarAtividades(Vetor vetor) {
        String Atividades =
                "ID Atividade: 0\n" +
                "Descrição: Cadastro\n" +
                "Data de Início: 13/10/2023\n" +
                "Data de Fim: 13/10/2023\n";
        JOptionPane.showInternalMessageDialog(null, Atividades, "Atividades recentes", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void VisualizarEngajamento(Vetor vetor) {
        String Relatorio =
                "ID do Engajamento: 1\n" +
                "Engajamento Total: 0%";
        JOptionPane.showInternalMessageDialog(null, Relatorio, "Relatório de Engajamento", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void Deleta(Vetor vetor) throws Exception {

        int Confirm = JOptionPane.showConfirmDialog(null, "Deseja excluir o seu cadastro?", "Excluir Conta", JOptionPane.INFORMATION_MESSAGE);

        if (Confirm == 0) {
            vetor.Deletar(0);

            JOptionPane.showMessageDialog(null, "Cadastro deletado com sucesso.");
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossos serviços!");

        }

        else {
            Ferramentas(vetor);
        }
    }
}