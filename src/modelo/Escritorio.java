package modelo;
import java.util.ArrayList;

public class Escritorio {
	private String nomeEscritorio;
	public ArrayList<Filial> filiais = new ArrayList<Filial>();
	
	public Escritorio(String nomeEscritorio, ArrayList<Filial> filiaisArrayList) {
		super();
		this.nomeEscritorio = nomeEscritorio;
		this.filiais = filiaisArrayList;
	}
	
	public String getNomeEscritorio() {
		return nomeEscritorio;
	}
	public void setNomeEmpresa(String nomeEscritorio) {
		this.nomeEscritorio = nomeEscritorio;
	}
	public void setFiliaisArrayList(ArrayList<Filial> filiaisArrayList) {
		this.filiais = filiaisArrayList;
	}
	public void cadastrarEditarFilial(Filial filial) {
		filiais.add(filial);
	}
	public ArrayList<Filial> getFiliaisArrayList() {
		return filiais;
	}
	
	public String toString() {
		return nomeEscritorio + filiais;
	}
	
	
}
