package controle;

import java.util.ArrayList;

import modelo.*;

public class ControleFilial {
	private Filial filial;
	private ArrayList<Filial> filiais = new ArrayList<Filial>();

	public ControleFilial(Dados d, int index) {
		filial = d.getEscritorio().getFiliais().get(index);
		filiais = d.getEscritorio().getFiliais();
	}

	public ControleFilial(Dados d) {
		filiais = d.getEscritorio().getFiliais();
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public ArrayList<Filial> getFiliais() {
		return filiais;
	}

	public int getQtdFiliais() {
		return filiais.size();
	}

	public void setFiliais(ArrayList<Filial> filiais) {
		this.filiais = filiais;
	}



}