package ENTREGA02;

public class Vetor {
    private int tamanho;
    private Object[] Membros;

    public int tamanho () {
         return this.tamanho;
    }

    public Vetor (int capacidade) {
        this.Membros = new Object[capacidade];
        this.tamanho = 0;
    }

    private void AumentaCapacidade () {

        if (this.tamanho == this.Membros.length) {
            Object[] NovosMembros = new Object[this.Membros.length * 2];

            for (int i = 0; i < this.Membros.length; i++) {
                NovosMembros[i] = this.Membros[i];
            }

            this.Membros = NovosMembros;
        }
    }

    public void Adiciona (Object Membros) throws Exception {
        this.AumentaCapacidade();

        if (this.tamanho < this.Membros.length) {
            this.Membros[this.tamanho] = Membros;
            this.tamanho++;
        }

        else {
            throw new Exception ("O banco de dados está cheio, não é possível adiconar novos Membos");
        }
    }

    public void Deletar (int posicao) throws Exception {

        if (posicao >= 0 && posicao < tamanho) {

            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.Membros[i] = this.Membros[i + 1];
            }

            this.tamanho--;
        }

        else {
            throw new Exception("Posição Inválida");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i< this.tamanho - 1; i++) {
            s.append(this.Membros[i]);
            s.append("]\n[");
        }

        if (this.tamanho> 0) {
            s.append(this.Membros[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
