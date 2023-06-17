package controle;

import modelo.Filial;

public class ControleFilial {
    private Filial filial;

    public ControleFilial(Filial filial) {
        this.filial = filial;
    }

    public void cadastrarFilial(String nome, String cnpj, String endereco) {
        filial = new Filial(nome, cnpj, endereco);
    }

    public void atualizarFilial(String novoNome, String novoCNPJ, String novoEndereco) {
        filial.setNome(novoNome);
        filial.setCnpj(novoCNPJ);
        filial.setEndereco(novoEndereco);
    }

    public void excluirFilial() {
        filial = null;
    }

    public Filial getFilial() {
        return filial;
    }
}
