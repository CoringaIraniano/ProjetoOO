package controle;

import java.util.ArrayList;

import modelo.*;

public class ControleFilial {
	private ArrayList<Filial> filiais = new ArrayList<Filial>();

	public ControleFilial(ControleDados d) {
		filiais = d.getEscritorio().getFiliais();
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