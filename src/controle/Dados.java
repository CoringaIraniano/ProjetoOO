package controle;
import java.util.Iterator;

import modelo.*;

public class Dados {
	private Escritorio escritorio = new Escritorio();

	public Escritorio getEscritorio() {
		return escritorio;
	}

	public void setEscritorio(Escritorio escritorio) {
		this.escritorio = escritorio;
	}
	
	public void cadastrarEditarFilial(String nome, String cnpj, String endereco, int index) {
	    Filial filialTemporaria = new Filial(nome, cnpj, endereco);
	    escritorio.setFiliais(filialTemporaria);
	}
	
	
	
	/*
	public Dados() {
		escritorio.fillWithSomeData();
	}
	*/
	
	
}
