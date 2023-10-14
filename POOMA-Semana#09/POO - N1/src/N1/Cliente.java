package N1;

public class Cliente {

    private int ID;
    private String Nome;
    private String Senha;
    private String Email;
    private String Telefone;
    private String NomeEmpresa;


    public Cliente() {}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Cliente(int id, String nome, String nomeEmpresa, String email, String senha, String telefone) {
        this.ID = id;
        this.Nome = nome;
        this.NomeEmpresa = nomeEmpresa;
        this.Email = email;
        this.Senha = senha;
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

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    @Override
    public String toString() {
        return "ID: " + ID + "| Nome: " + Nome + " | Nome da Empresa: " + NomeEmpresa + " | E-mail: " + Email + " | Telefone: " + Telefone;
    }
}