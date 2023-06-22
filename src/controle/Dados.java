package controle;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.*;

public class Dados {
	private Escritorio escritorio = new Escritorio();
	private ArrayList<Filial> filiais = new ArrayList<Filial>();

	public Escritorio getEscritorio() {
		return escritorio;
	}

	public void setEscritorio(Escritorio escritorio) {
		this.escritorio = escritorio;
	}
	
	/*
	public boolean editarCadastrarFilial(Filial f) {
		if (f != null) {
			filiais.add(f);
			return true;
		} else {
			return false;
		}
	}
	*/
		
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
	
	public void excluirFilial(int index) {
		filiais = escritorio.getFiliais();
		
		if(index >= 0 && index < filiais.size()) {
			filiais.remove(index);
		}
	}
	
	/*	
	public void cadastrarEditarFilial(String nome, String cnpj, String endereco, int index) {
	    Filial filialTemporaria = new Filial(nome, cnpj, endereco);
	    
	    if (index >= 0 && index < escritorio.getFiliais().size()) {
	        Filial filialExistente = escritorio.getFiliais().get(index);
	        
	        if (filialExistente.equals(filialTemporaria)) {
	            return;
	        }
	        
	        escritorio.getFiliais().set(index, filialTemporaria);
	    } else {
	        escritorio.getFiliais().add(filialTemporaria);
	    }
	}
*/	
	
	
	/*
	public Dados() {
		escritorio.fillWithSomeData();
	}
	*/
	
	
}
