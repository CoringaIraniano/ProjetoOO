package controle;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.*;

public class Dados {
	private Filial filial = new Filial();
	private Escritorio escritorio = new Escritorio();
	private ArrayList<ItemPatrimonio> patrimonios = new ArrayList<ItemPatrimonio>();
	private ArrayList<Filial> filiais = new ArrayList<Filial>();

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public Escritorio getEscritorio() {
		return escritorio;
	}

	public void setEscritorio(Escritorio escritorio) {
		this.escritorio = escritorio;
	}

	public void cadastrarEditarFilial(String nome, String cnpj, String endereco, int index) {
		Filial filialTemporaria = new Filial(nome, cnpj, endereco);
		if (index == escritorio.getFiliais().size()) {
			escritorio.setFiliais(filialTemporaria);
		} else {
			escritorio.getFiliais().get(index).setNome(nome);
			escritorio.getFiliais().get(index).setCnpj(cnpj);
			escritorio.getFiliais().get(index).setEndereco(endereco);
		}

	}

	public void cadastrarEditarPatrimonioVeiculo(String nome, String quantidade, String valor, String marca,
			String tipoVeiculo, String cor, String qtdPortas, int index) {
		Veiculo veiculoTemporario = new Veiculo(nome, Integer.parseInt(quantidade), Double.parseDouble(valor), marca,
				tipoVeiculo, cor, Integer.parseInt(qtdPortas));
		if (index == filial.getPatrimonio().size()) {
			filial.cadastrarPatrimonio(veiculoTemporario);
		} else {
			filial.getPatrimonio().get(index).setNomeItem(nome);
			filial.getPatrimonio().get(index).setQuantidade(Integer.parseInt(quantidade));
			filial.getPatrimonio().get(index).setValor(Double.parseDouble(valor));
			filial.getPatrimonio().get(index).setMarca(marca);
			((Veiculo) filial.getPatrimonio().get(index)).setCor(cor);
			((Veiculo) filial.getPatrimonio().get(index)).setTipoVeiculo(tipoVeiculo);
			((Veiculo) filial.getPatrimonio().get(index)).setQtdPortas(Integer.parseInt(qtdPortas));
		}
	}

	public void cadastrarEditarPatrimonioConstucao(String nome, String quantidade, String valor, String marca,
			String pesoEquipamento, String anoFabricacao, String material, int index) {
		EquipamentoConstrucao eqpconstrucaoTemporario = new EquipamentoConstrucao(nome, Integer.parseInt(quantidade),
				Double.parseDouble(valor), marca, Double.parseDouble(pesoEquipamento), Integer.parseInt(anoFabricacao),
				material);
		if (index == filial.getPatrimonio().size()) {
			filial.cadastrarPatrimonio(eqpconstrucaoTemporario);
		} else {
			filial.getPatrimonio().get(index).setNomeItem(nome);
			filial.getPatrimonio().get(index).setQuantidade(Integer.parseInt(quantidade));
			filial.getPatrimonio().get(index).setValor(Double.parseDouble(valor));
			filial.getPatrimonio().get(index).setMarca(marca);
			((EquipamentoConstrucao) filial.getPatrimonio().get(index)).setPesoEquipamento(Double.parseDouble(pesoEquipamento));
			((EquipamentoConstrucao) filial.getPatrimonio().get(index)).setAnoFabricacao(Integer.parseInt(anoFabricacao));
			((EquipamentoConstrucao) filial.getPatrimonio().get(index)).setMaterial(material);
		}

	}

	public void excluirFilial(int index) {
		filiais = escritorio.getFiliais();

		if (index >= 0 && index < filiais.size()) {
			filiais.remove(index);
		}
	}
	
	public void excluirPatrimonio(int index) {
		patrimonios = filial.getPatrimonio();
		if (index >= 0 && index < patrimonios.size()) {
			patrimonios.remove(index);
		}
	}

	public ArrayList<ItemPatrimonio> verificaItem(int index) {
		ArrayList<ItemPatrimonio> itemPatrimonios = new ArrayList<>();
		itemPatrimonios = filiais.get(index).getPatrimonio();
		return itemPatrimonios;
	}

}
