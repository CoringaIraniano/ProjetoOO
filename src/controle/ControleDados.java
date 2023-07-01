package controle;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.*;

public class ControleDados {
	private Escritorio escritorio = new Escritorio();

	public ControleDados() {
		escritorio.fillWithSomeData();
		fillPatrimoniosWithSomeData();
	}

	public Filial getFilial(int index) {
		return escritorio.getFiliais().get(index);
	}

	public ArrayList<Filial> getFiliais() {
		return escritorio.getFiliais();
	}

	public void setFilial(ArrayList<Filial> filial) {
		escritorio.setFiliais(filial);
	}

	public Escritorio getEscritorio() {
		return escritorio;
	}

	public void setEscritorio(Escritorio escritorio) {
		this.escritorio = escritorio;
		escritorio.getFiliais();
	}

	public boolean editarCadastrarFilial(String nome, String cnpj, String endereco, int index) {
	    if (!cnpj.matches("[0-9]+")) {
	        return false;
	    } else {
	        Filial filialTemporaria = new Filial(nome, cnpj, endereco);

	        if (index == escritorio.getFiliais().size()) {
	            // Adiciona a nova filial ao escritório
	            escritorio.getFiliais().add(filialTemporaria);
	        } else {
	            // Copia os patrimônios da filial existente para a nova filial
	            Filial filialExistente = escritorio.getFiliais().get(index);
	            filialTemporaria.setPatrimonio(filialExistente.getPatrimonio());

	            // Substitui a filial existente pela nova filial
	            escritorio.getFiliais().set(index, filialTemporaria);
	        }
	        return true;
	    }
	}


	public boolean editarCadastrarPatrimonioVeiculo(String nome, String quantidade, String valor, String marca,
			String tipoVeiculo, String cor, String qtdPortas, int indexFilial, int index) {
		if (!quantidade.matches("[0-9]+") || !valor.matches("[-+]?[0-9]*\\.?[0-9]*") || !qtdPortas.matches("[0-9]+")) {
			return false;
		} else {
			Veiculo veiculoTemporario = new Veiculo(nome, Integer.parseInt(quantidade), Double.parseDouble(valor),
					marca, tipoVeiculo, cor, Integer.parseInt(qtdPortas));
			if (index == escritorio.getFiliais().get(indexFilial).getPatrimonio().size()) {
				escritorio.getFiliais().get(indexFilial).editarCadastrarPatrimonio(veiculoTemporario);

			} else {
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index).setNomeItem(nome);
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index)
						.setQuantidade(Integer.parseInt(quantidade));
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index).setValor(Double.parseDouble(valor));
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index).setMarca(marca);
				((Veiculo) escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index)).setCor(cor);
				((Veiculo) escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index))
						.setTipoVeiculo(tipoVeiculo);
				((Veiculo) escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index))
						.setQtdPortas(Integer.parseInt(qtdPortas));

			}
			return true;
		}
	}

	public boolean editarCadastrarPatrimonioEletronico(String nome, String quantidade, String valor, String marca,
			String peso, String voltagem, String sistema, String modelo, int indexFilial, int index) {
		if (!quantidade.matches("[0-9]+") || !valor.matches("[-+]?[0-9]*\\.?[0-9]*")
				|| !peso.matches("[-+]?[0-9]*\\.?[0-9]*") || !voltagem.matches("[0-9]+")) {
			return false;
		} else {
			EquipamentoEletronico eqpeletronicoTemporario = new EquipamentoEletronico(nome,
					Integer.parseInt(quantidade), Double.parseDouble(valor), marca, Double.parseDouble(peso),
					Integer.parseInt(voltagem), sistema, modelo);
			if (index == escritorio.getFiliais().get(indexFilial).getPatrimonio().size()) {
				escritorio.getFiliais().get(indexFilial).editarCadastrarPatrimonio(eqpeletronicoTemporario);

			} else {
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index).setNomeItem(nome);
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index)
						.setQuantidade(Integer.parseInt(quantidade));
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index).setValor(Double.parseDouble(valor));
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index).setMarca(marca);
				((EquipamentoEletronico) escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index))
						.setPesoEquipamento(Double.parseDouble(peso));
				((EquipamentoEletronico) escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index))
						.setVoltagem(Integer.parseInt(voltagem));
				((EquipamentoEletronico) escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index))
						.setSistema(sistema);
			}
			return true;
		}
	}

	public boolean editarCadastrarPatrimonioConstrucao(String nome, String quantidade, String valor, String marca,
			String pesoEquipamento, String anoFabricacao, String material, int indexFilial, int index) {
		if (!quantidade.matches("[0-9]+") || !valor.matches("[-+]?[0-9]*\\.?[0-9]*")
				|| !pesoEquipamento.matches("[-+]?[0-9]*\\.?[0-9]*") || !anoFabricacao.matches("[0-9]+")) {
			return false;
		} else {
			EquipamentoConstrucao eqpconstrucaoTemporario = new EquipamentoConstrucao(nome,
					Integer.parseInt(quantidade), Double.parseDouble(valor), marca, Double.parseDouble(pesoEquipamento),
					Integer.parseInt(anoFabricacao), material);
			if (index == escritorio.getFiliais().get(indexFilial).getPatrimonio().size()) {
				escritorio.getFiliais().get(indexFilial).editarCadastrarPatrimonio(eqpconstrucaoTemporario);

			} else {
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index).setNomeItem(nome);
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index)
						.setQuantidade(Integer.parseInt(quantidade));
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index).setValor(Double.parseDouble(valor));
				escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index).setMarca(marca);
				((EquipamentoConstrucao) escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index))
						.setPesoEquipamento(Double.parseDouble(pesoEquipamento));
				((EquipamentoConstrucao) escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index))
						.setAnoFabricacao(Integer.parseInt(anoFabricacao));
				((EquipamentoConstrucao) escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index))
						.setMaterial(material);
			}
			return true;
		}
	}

	public int verificaPatrimonio(int index, int indexFilial) {
		int eletronico = 1;
		int equipamento = 2;
		int veiculo = 3;
		ItemPatrimonio patrimonio = escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index);
		if (patrimonio instanceof EquipamentoEletronico) {
			return eletronico;
		}
		if (patrimonio instanceof EquipamentoConstrucao) {
			return equipamento;
		}
		if (patrimonio instanceof Veiculo) {
			return veiculo;
		}
		return 0;
	}

	public Veiculo veiculo(int index, int indexFilial) {
		ItemPatrimonio item = escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index);
		return ((Veiculo) item);
	}

	public EquipamentoConstrucao eqpConstrucao(int index, int indexFilial) {
		ItemPatrimonio item = escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index);
		return ((EquipamentoConstrucao) item);
	}

	public EquipamentoEletronico eqpEquipamentoEletronico(int index, int indexFilial) {
		ItemPatrimonio item = escritorio.getFiliais().get(indexFilial).getPatrimonio().get(index);
		return ((EquipamentoEletronico) item);
	}

	public void excluirFilial(int index) {

		if (index >= 0 && index < escritorio.getFiliais().size()) {
			escritorio.removerFilial(getFiliais().get(index));
		}
	}

	public void excluirPatrimonio(int indexFilial, int index) {
		if (index >= 0 && index < escritorio.getFiliais().get(indexFilial).getPatrimonio().size()) {
			escritorio.getFiliais().get(indexFilial).getPatrimonio().remove(index);
		}
	}

	public void fillPatrimoniosWithSomeData() {
		int i = 0; // Número da filial

		for (Filial filial : escritorio.getFiliais()) {
			for (int j = 0; j < 3; j++) { // Ajuste para percorrer apenas 3 vezes (para cada tipo de patrimônio)
				ItemPatrimonio patrimonio;
				String tipo;
				String nome;
				int quantidade = 1;
				double valor = 2500 + j;
				String marca = "Marca" + j;

				if (j == 0) {
					patrimonio = new Veiculo();
					tipo = "Veiculo";
					((Veiculo) patrimonio).setTipoVeiculo("Tipo" + i);
					((Veiculo) patrimonio).setCor("Cor" + i);
					((Veiculo) patrimonio).setQtdPortas(2);
				} else if (j == 1) {
					patrimonio = new EquipamentoEletronico();
					tipo = "Eletronico";
					((EquipamentoEletronico) patrimonio).setPesoEquipamento(i);
					((EquipamentoEletronico) patrimonio).setVoltagem(220);
					((EquipamentoEletronico) patrimonio).setSistema("Sistema" + i);
					((EquipamentoEletronico) patrimonio).setModelo("Modelo" + i);
				} else {
					patrimonio = new EquipamentoConstrucao();
					tipo = "Equipamento";
					((EquipamentoConstrucao) patrimonio).setPesoEquipamento(i);
					((EquipamentoConstrucao) patrimonio).setAnoFabricacao(2010 + i);
					((EquipamentoConstrucao) patrimonio).setMaterial("Material" + i);
				}

				nome = tipo + i; // Concatena o tipo e o número da filial

				patrimonio.setNomeItem(nome);
				patrimonio.setQuantidade(quantidade);
				patrimonio.setValor(valor);
				patrimonio.setMarca(marca);

				filial.editarCadastrarPatrimonio(patrimonio);
			}

			i++; // Incrementa o número da filial para a próxima iteração
		}
	}

	public String[] getNomesFiliais() {
		String[] nomes = new String[escritorio.getFiliais().size()];

		for (int i = 0; i < escritorio.getFiliais().size(); i++) {
			nomes[i] = escritorio.getFiliais().get(i).getNome();
			// System.out.println(nomes[i]);
		}

		return nomes;
	}

}
