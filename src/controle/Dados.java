package controle;

import java.util.ArrayList;

import modelo.*;

public class Dados {
	private Escritorio escritorio = new Escritorio();
	private ArrayList<ItemPatrimonio> patrimonios = new ArrayList<ItemPatrimonio>();
	private ArrayList<Filial> filiais = new ArrayList<Filial>();

	public Filial getFilial(int index) {
		return filiais.get(index);
	}
	
	public ArrayList<Filial> getFiliais() {
		return filiais;
	}

	public void setFilial(ArrayList<Filial> filial) {
		this.filiais = filial;
		escritorio.setFiliais(filial);
	}

	public Escritorio getEscritorio() {
		return escritorio;
	}

	public void setEscritorio(Escritorio escritorio) {
		this.escritorio = escritorio;
		filiais = escritorio.getFiliais();
	}

	public void editarCadastrarFilial(String nome, String cnpj, String endereco, int index) {
		Filial filialTemporaria = new Filial(nome, cnpj, endereco);
		
		escritorio.editarCadastrarFilial(index, filialTemporaria);
		filiais.add(filialTemporaria);

	}

	public void cadastrarEditarPatrimonioVeiculo(String nome, String quantidade, String valor, String marca,
			String tipoVeiculo, String cor, String qtdPortas, int indexFilial, int index) {
		Veiculo veiculoTemporario = new Veiculo(nome, Integer.parseInt(quantidade), Double.parseDouble(valor), marca,
				tipoVeiculo, cor, Integer.parseInt(qtdPortas));
		if (index == filiais.get(indexFilial).getPatrimonio().size()) {
			filiais.get(indexFilial).cadastrarPatrimonio(veiculoTemporario);
			escritorio.setFiliais(filiais);
		} else {
			filiais.get(indexFilial).getPatrimonio().get(index).setNomeItem(nome);
			filiais.get(indexFilial).getPatrimonio().get(index).setQuantidade(Integer.parseInt(quantidade));
			filiais.get(indexFilial).getPatrimonio().get(index).setValor(Double.parseDouble(valor));
			filiais.get(indexFilial).getPatrimonio().get(index).setMarca(marca);
			((Veiculo) filiais.get(indexFilial).getPatrimonio().get(index)).setCor(cor);
			((Veiculo) filiais.get(indexFilial).getPatrimonio().get(index)).setTipoVeiculo(tipoVeiculo);
			((Veiculo) filiais.get(indexFilial).getPatrimonio().get(index)).setQtdPortas(Integer.parseInt(qtdPortas));
			escritorio.setFiliais(filiais);
		}
	}

	public void cadastrarEditarPatrimonioConstucao(String nome, String quantidade, String valor, String marca,
			String pesoEquipamento, String anoFabricacao, String material, int indexFilial, int index) {
		EquipamentoConstrucao eqpconstrucaoTemporario = new EquipamentoConstrucao(nome, Integer.parseInt(quantidade),
				Double.parseDouble(valor), marca, Double.parseDouble(pesoEquipamento), Integer.parseInt(anoFabricacao),
				material);
		if (index == filiais.get(indexFilial).getPatrimonio().size()) {
			filiais.get(indexFilial).cadastrarPatrimonio(eqpconstrucaoTemporario);
			escritorio.setFiliais(filiais);
			
		} else {
			filiais.get(indexFilial).getPatrimonio().get(index).setNomeItem(nome);
			filiais.get(indexFilial).getPatrimonio().get(index).setQuantidade(Integer.parseInt(quantidade));
			filiais.get(indexFilial).getPatrimonio().get(index).setValor(Double.parseDouble(valor));
			filiais.get(indexFilial).getPatrimonio().get(index).setMarca(marca);
			((EquipamentoConstrucao) filiais.get(indexFilial).getPatrimonio().get(index)).setPesoEquipamento(Double.parseDouble(pesoEquipamento));
			((EquipamentoConstrucao) filiais.get(indexFilial).getPatrimonio().get(index)).setAnoFabricacao(Integer.parseInt(anoFabricacao));
			((EquipamentoConstrucao) filiais.get(indexFilial).getPatrimonio().get(index)).setMaterial(material);
			escritorio.setFiliais(filiais);
		}

	}

	public void excluirFilial(int index) {
		filiais = escritorio.getFiliais();

		if (index >= 0 && index < filiais.size()) {
			filiais.remove(index);
			escritorio.setFiliais(filiais);
		}
	}
	
	public void excluirPatrimonio(int indexFilial, int index) {
		patrimonios = filiais.get(indexFilial).getPatrimonio();
		if (index >= 0 && index < patrimonios.size()) {
			patrimonios.remove(index);
			//filiais.get(indexFilial).getPatrimonio().remove(index);
			//escritorio.getFiliais().get(index).getPatrimonio().remove(index);
		}
	}

	public ArrayList<ItemPatrimonio> verificaItem(int index) {
		ArrayList<ItemPatrimonio> itemPatrimonios = new ArrayList<>();
		itemPatrimonios = filiais.get(index).getPatrimonio();
		return itemPatrimonios;
	}

}
