
package ENTREGA02;

public class CadastrarClientes {

    private int ID;
    private String Nome;
    private String Email;
    private String Telefone;
    private String NomeEmpresa;

    public CadastrarClientes() {}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public CadastrarClientes(int id, String nome, String nomeEmpresa, String email,String telefone) {
        this.ID = id;
        this.Nome = nome;
        this.NomeEmpresa = nomeEmpresa;
        this.Email = email;
        this.Telefone = telefone;

    }

    public  String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        NomeEmpresa = nomeEmpresa;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    @Override
    public String toString() {
        return "ID: " + ID + "| Nome: " + Nome + " | Nome da Empresa: " + NomeEmpresa + " | E-mail: " + Email + "| Telefone: " + Telefone;
    }
}