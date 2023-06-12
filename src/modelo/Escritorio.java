package modelo;
import java.util.ArrayList;

public class Escritorio {
	private String nomeEmpresa;
	private ArrayList<Filial> filiaisArrayList = new ArrayList<Filial>();
	
	public Escritorio(String nomeEmpresa, ArrayList<Filial> filiaisArrayList) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.filiaisArrayList = filiaisArrayList;
	}
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public ArrayList<Filial> getFiliaisArrayList() {
		return filiaisArrayList;
	}
	public void setFiliaisArrayList(ArrayList<Filial> filiaisArrayList) {
		this.filiaisArrayList = filiaisArrayList;
	}
	
	
}
