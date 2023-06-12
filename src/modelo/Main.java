package modelo;
import java.util.ArrayList;
import java.util.Iterator;
public class Main {
	public static void main(String[] arg) {
		Filial filial1 = new Filial("SAConstrucao", "12345678912345", "QR5 Conj C 46, Brasilia-DF");
		EquipamentoConstrucao patrimonio1 = new EquipamentoConstrucao("Furadeira", 2, 750, "Borch", 2.4, 2004, "Ferro");
		EquipamentoEletronico patrimonio2 = new EquipamentoEletronico("Notebook", 1, 3800, "Acer", 2.4, 220, "Windows", "28789RF");
		Veiculo patrimonio3 = new Veiculo("GTR", 1, 100000, "Nissan", "Leve", "Preto", 2);
		
		filial1.cadastrarPatrimonio(patrimonio3);
		
		for(ItemPatrimonio item: filial1.getPatrimonio()) {
			System.out.println(item);
		}
		
		
		/*
		System.out.println("------------BSA Construcao & Associados------------\n");
		System.out.println("--------------FILIAL--------------");
		System.out.println(filial1.toString());
		System.out.println("------------PATRIMONIO------------");
		System.out.println(patrimonio1.toString());
		System.out.println(patrimonio2.toString());
		System.out.println(patrimonio3.toString());
		System.out.println("----------------------------------");
		*/
		
	}
}
