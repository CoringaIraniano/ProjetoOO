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

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String toString() {
		return "NOME PATRIMONIO: " + nomeItem + "\nQUANTIDADE: " + quantidade + "\nVALOR: " + valor +"\nMARCA: "+ marca +"\n";
	}
	
	// Sobrescreve a função equals para que ele busque o patrimônio com base no nome e não com base no seu endereço de memória
	@Override
	public boolean equals(Object item) {
	    if (item instanceof ItemPatrimonio) {
	        String nomeItem = ((ItemPatrimonio) item).getNomeItem();
	        return this.nomeItem.equals(nomeItem);
	    }
	    return false;
	}

}
