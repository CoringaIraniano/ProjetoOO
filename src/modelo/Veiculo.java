package modelo;

public class Veiculo extends ItemPatrimonio {
	private String tipoVeiculo;
	private String cor;
	private int qtdPortas;

	public Veiculo() {
		super();
	}

	public Veiculo(String nomeItem, int quantidade, double valor, String marca, String tipoVeiculo, String cor,
			int qtdPortas) {
		this.nomeItem = nomeItem;
		this.quantidade = quantidade;
		this.valor = valor;
		this.tipoVeiculo = tipoVeiculo;
		this.cor = cor;
		this.qtdPortas = qtdPortas;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	@Override
	public String toString() {
		return super.toString() + "TIPO: " + tipoVeiculo + "\nCOR: " + cor
				+ "\nQUANTIDADE DE PORTAS: " + qtdPortas + "\n";
	}

}
