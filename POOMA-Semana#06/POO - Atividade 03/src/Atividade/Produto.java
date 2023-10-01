package Atividade;

public class Produto {

    private int Id;
    private int Classificao;
    private String nomeProduto;
    private double precoProduto;


    public Produto() {}

    public Produto(int id, int classificao, String nomeProduto, double precoProduto) {
        this.Id = id;
        this.Classificao = classificao;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public int getId() {
        return Id;
    }

    public int getClassificao() {
        return Classificao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setClassificao(int classificao) {
        Classificao = classificao;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public String toString() {

        return "ID: " + Id + " | Cod. Classificacao: " + Classificao + " | Nome: " + nomeProduto + " | Preco: R$ " + precoProduto;

    }
}
