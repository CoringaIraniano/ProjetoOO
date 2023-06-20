package controle;

import java.util.ArrayList;

import modelo.*;

public class ControleFilial {
    private Filial filial;
    private ArrayList<Filial> filiais = new ArrayList<Filial>();

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public ArrayList<Filial> getFiliais() {
		return filiais;
	}

	public void setFiliais(ArrayList<Filial> filiais) {
		this.filiais = filiais;
	}
    

}
