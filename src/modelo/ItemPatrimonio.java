package modelo;

public abstract class ItemPatrimonio {
	protected String nomeItem;
	protected int quantidade;
	protected double valor;
	protected String marca;

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String setMarca() {
		return marca;
	}

	public String toString() {
		return "NOME PATRIMONIO: " + nomeItem + "\nQUANTIDADE: " + quantidade + "\nVALOR: " + valor +"\nMARCA: "+ marca +"\n";
	}

}
