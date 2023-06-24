package modelo;
import java.util.ArrayList;

public class Filial {
	private String nome;
	private String cnpj;
	private String endereco;
	private ArrayList<ItemPatrimonio> patrimonio = new ArrayList<ItemPatrimonio>();

	public Filial() {
		
	}
	
	public Filial(String nome, String endereco, String cnpj) {
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.patrimonio = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<ItemPatrimonio> getPatrimonio() {
		return patrimonio;
	}


	public String toString() {
		return "\nNOME FILIAL: " + nome + "\nCNPJ: " + cnpj + "\nENDERECO: " + endereco + "\n";
	}
	
	public void cadastrarPatrimonio(ItemPatrimonio item) {
		patrimonio.add(item);
	}
	
	public void removerPatrimonio(ItemPatrimonio item) {
		patrimonio.remove(item);
	}
	
	public String[] listarPatrimonio(){
		String[] patrimonioListados = new String[patrimonio.size()];
		for (int i=0 ;i < patrimonio.size(); i++){
			patrimonioListados[i] = patrimonio.get(i).getNomeItem();
		}
		return patrimonioListados;

	}


	

}
