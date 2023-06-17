package controle;
import modelo.*;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class Dados {
	static ArrayList<Filial> filiais = new ArrayList<Filial>();
	public static void cadastrarEditarFilial(String nome, String endereco, String cnpj) {
        Escritorio escritorio = new Escritorio("Bsa Construcao", filiais);
        Filial novaFilial = new Filial(nome, endereco, cnpj);
        filiais.add(novaFilial);
       // escritorio.cadastrarEditarFilial(filial);
    }
	public static ArrayList<Filial> getFiliais() {
		return filiais;
	}
}
