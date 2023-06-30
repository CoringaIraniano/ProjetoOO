package modelo;

import java.util.ArrayList;

public class Escritorio {
	private String nomeEscritorio;
	private ArrayList<Filial> filiais = new ArrayList<Filial>();

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

	public void setFiliais(ArrayList<Filial> filial) {
		filiais = filial;
	}

	public ArrayList<Filial> getFiliais() {
		return filiais;
	}

	public void fillWithSomeData() {
		for (int i = 0; i < 5; i++) {
			Filial f = new Filial();
			
			String nomeFilial = "Filial" + i;
			String cnpjFilial = "12345678912345" + i;
			String enderecoFilial = "Endereco" + i;
			
			f.setNome(nomeFilial);
			f.setCnpj(cnpjFilial);
			f.setEndereco(enderecoFilial);
			filiais.add(f);
		}

	}

	public void editarCadastrarFilial(int index, Filial filial) {
		if (index == filiais.size()) {
			filiais.add(filial);
		} else {
			filiais.get(index).setNome(filial.getNome());
			filiais.get(index).setCnpj(filial.getCnpj());
			filiais.get(index).setEndereco(filial.getEndereco());
			filiais.get(index).setPatrimonio(filial.getPatrimonio());
		}
	}

	public String[] listarFiliais() {
		String[] filiaisListadas = new String[filiais.size()];
		for (int i = 0; i < filiais.size(); i++) {
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
