package modelo;
import java.util.ArrayList;

public class Escritorio {
	private String nomeEscritorio;
	public ArrayList<Filial> filiais = new ArrayList<Filial>();
	
	public Escritorio() {
		
	}
	
	public Escritorio(String nomeEscritorio, ArrayList<Filial> filiais) {
		super();
		this.nomeEscritorio = nomeEscritorio;
		this.filiais = filiais;
	}
	
	public String getNomeEscritorio() {
		return nomeEscritorio;
	}
	public void setNomeEscritorio(String nomeEscritorio) {
		this.nomeEscritorio = nomeEscritorio;
	}
	public void setFiliais(Filial filial) {
		filiais.add(filial);
	}
	
	public ArrayList<Filial> getFiliais() {
		return filiais;
	}
	
	public void editarCadastrarFilial(int index, Filial filial) {
		filiais.add(index, filial);
	}
	
	public String[] listarFiliais() {
		String[] filiaisListadas = new String[filiais.size()];
		for(int i = 0; i < filiais.size(); i++) {
			filiaisListadas[i] = filiais.get(i).getNome();
		}
		return filiaisListadas;
	}
	
	public void removerFilial(Filial filial) {
		filiais.remove(filial);
	}
	
	public String toString() {
		return nomeEscritorio + filiais;
	}
}
