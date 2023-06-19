package controle;
import modelo.*;

public class Dados {
	private Escritorio escritorio = new Escritorio();

	public Escritorio getEscritorio() {
		return escritorio;
	}

	public void setEscritorio(Escritorio escritorio) {
		this.escritorio = escritorio;
	}
	
	public void cadastrarEditarFilial(String nome, String cnpj, String endereco) {
		Filial filialTemporaria = new Filial(nome, cnpj, endereco);
		escritorio.setFiliais(filialTemporaria);
	}
	
	/*
	public Dados() {
		escritorio.fillWithSomeData();
	}
	*/
	
	
}
