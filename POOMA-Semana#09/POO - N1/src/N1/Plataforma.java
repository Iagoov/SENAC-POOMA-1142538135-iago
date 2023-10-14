package N1;

public class Plataforma {
    public static void main(String[] args) {
        CadastrarClientes cadastroClientes = new CadastrarClientes();

        try {
            cadastroClientes.CadastraCliente();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
