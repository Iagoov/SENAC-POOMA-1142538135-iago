package Atividade;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroProdutos {

    public static void main (String [] args) {
        ArrayList<Produto> produto = new ArrayList<Produto>();

        do {
            int escolha = exibirMenu();

            switch (escolha) {
                case 1:
                    cadastrarProduto(produto);
                break;

                case 2:
                    consultarProduto(produto);
                break;

                case 3:
                    excluirProduto(produto);
                break;

                case 4:
                    alterarProduto(produto);
                break;

                case 5:
                    listarProdutos(produto);
                break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Conexão Encerrada.");
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
            }
        } while (true);
    }

    private static int exibirMenu() {
        String menu = "Escolha uma opção:\n" +
        "1 - Cadastrar Produto\n" +
        "2 - Consultar Produto\n" +
        "3 - Excluir Produto\n" +
        "4 - Alterar Produto\n" +
        "5 - Listar Todos os Produtos\n" +
        "0 - Sair";

        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    private static void cadastrarProduto(ArrayList<Produto> produto) {

        int respo = 0;
        int id = 1;

        do {

            int classificacap = Integer.parseInt(JOptionPane.showInputDialog("Insira o Código de Classificação: "));
            String nome = JOptionPane.showInputDialog("Insira o Nome do Porduto: ");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o Preço do Produto: "));

            Produto M1 = new Produto(id, classificacap, nome, preco);

            try {
                produto.add(M1);
            }

            catch (Exception e) {
                e.printStackTrace();
            }

            JOptionPane.showInternalMessageDialog(null, "Produto Cadastrado.");

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro Produto?");

            if (resposta == 0) {
                id++;
            }

            respo = resposta;

        } while (respo == 0);
    }

    private static void consultarProduto(ArrayList<Produto> produtos) {

        int idConsulta = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID do Produto a ser consultado: "));

        for (Produto produto : produtos) {

            if (produto.getId() == idConsulta) {
                JOptionPane.showMessageDialog(null, produto.toString());
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Produto não encontrado.");
    }

    private static void excluirProduto(ArrayList<Produto> produtos) {

        int idExclusao = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID do Produto a ser excluído: "));

        for (Produto produto : produtos) {

            if (produto.getId() == idExclusao) {
                produtos.remove(produto);
                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso.");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Produto não encontrado.");
    }

    private static void alterarProduto(ArrayList<Produto> produtos) {
        int idAlteracao = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID do Produto a ser alterado: "));

        for (Produto produto : produtos) {

            if (produto.getId() == idAlteracao) {
                int classificacao = Integer.parseInt(JOptionPane.showInputDialog("Insira o novo Código de Classificação: "));
                String nome = JOptionPane.showInputDialog("Insira o novo Nome do Produto: ");
                double preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o novo Preço do Produto: "));

                produto.setClassificao(classificacao);
                produto.setNomeProduto(nome);
                produto.setPrecoProduto(preco);

                JOptionPane.showMessageDialog(null, "Produto alterado com sucesso.");

                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Produto não encontrado.");
    }

    private static void listarProdutos(ArrayList<Produto> produtos) {
        StringBuilder lista = new StringBuilder("Lista de Produtos:\n");

        for (Produto produto : produtos) {
            lista.append(produto.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, lista.toString());
    }
}
