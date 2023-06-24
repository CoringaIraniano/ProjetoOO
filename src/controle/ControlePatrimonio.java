package controle;

import java.util.ArrayList;

import modelo.*;

public class ControlePatrimonio {
	private ItemPatrimonio patrimonio;
	private ArrayList<ItemPatrimonio> patrimonios = new ArrayList<ItemPatrimonio>();

	public ControlePatrimonio(Dados d, int index) {
		patrimonio = d.getFilial().getPatrimonio().get(index);
		patrimonios = d.getFilial().getPatrimonio();
	}

	public ControlePatrimonio(Dados d) {
		patrimonios = d.getFilial().getPatrimonio();
	}

	public ItemPatrimonio getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(ItemPatrimonio patrimonio) {
		this.patrimonio = patrimonio;
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

}
