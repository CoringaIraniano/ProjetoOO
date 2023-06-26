package controle;

import java.util.ArrayList;

import modelo.*;

public class ControleFilial {
	private ArrayList<Filial> filiais = new ArrayList<Filial>();

	public ControleFilial(Dados d) {
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

	public String[] getNomesFiliais() {
		String[] nomes = new String[filiais.size()];
		
		for (int i = 0; i < filiais.size(); i++) {
			nomes[i] = filiais.get(i).getNome();
		}
		
		return nomes;
	}
}