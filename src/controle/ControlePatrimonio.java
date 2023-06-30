package controle;

import java.util.ArrayList;

import modelo.*;

public class ControlePatrimonio {
	private ArrayList<ItemPatrimonio> patrimonios = new ArrayList<ItemPatrimonio>();

	public ControlePatrimonio(ControleDados d, int index) {
		patrimonios = d.getFilial(index).getPatrimonio();
	}

	public ControlePatrimonio(ControleDados d) {
		for (int i = 0; i < d.getFiliais().size(); i++) {
			for (int j = 0; j < d.getFilial(i).getPatrimonio().size(); j++) {
				patrimonios.add(d.getFilial(i).getPatrimonio().get(j));
			}
		}
	}

	public ArrayList<ItemPatrimonio> getPatrimonios() {
		return patrimonios;
	}

	public int getQtdPatrimonios() {
		return patrimonios.size();
	}

	public void setPatrimonios(ArrayList<ItemPatrimonio> patrimonios) {
		this.patrimonios = patrimonios;
	}
	
	public String[] getNomesPatrimonios() {
		String[] nomes = new String[patrimonios.size()];

		for (int i = 0; i < patrimonios.size(); i++) {
			nomes[i] = patrimonios.get(i).getNomeItem();
		}
		
		return nomes;
	}

	
}
