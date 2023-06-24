package view.provisorio;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaGerenciamentoEquipamento {
	private JFrame janela = new JFrame("Edicao Equipamento de Construcao");
	private JLabel titulo = new JLabel("Equipamento de Construcao");
	private JLabel nomePatrimonio = new JLabel("Nome Patrimonio:");
	private JTextField nomePatrimonioJTF = new JTextField();
	private JLabel quantidade = new JLabel("Quantidade: ");
	private JTextField quantidadeJTF = new JTextField();
	private JLabel valor = new JLabel("Valor: ");
	private JTextField valorJTF = new JTextField();
	private JLabel marca = new JLabel("Marca: ");
	private JTextField marcaJTF = new JTextField();
	private JLabel peso = new JLabel("Peso: ");
	private JTextField pesoJTF = new JTextField();
	private JLabel anoFabricacao = new JLabel("Ano Fabricacao: ");
	private JTextField anoFabricacaoJTF = new JTextField();
	private JLabel material = new JLabel("Material: ");
	private JTextField materialJTF = new JTextField();
	private JButton excluir = new JButton("Excluir");
	private JButton salvar = new JButton("Salvar");

	public TelaGerenciamentoEquipamento() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(110, 8, 408, 50);
		
		nomePatrimonio.setBounds(10, 55, 208, 50);
		nomePatrimonio.setFont(new Font("Arial", Font.BOLD, 15));
		nomePatrimonioJTF.setBounds(150, 65, 280, 30);
		
		quantidade.setBounds(10, 95, 208, 50);
		quantidade.setFont(new Font("Arial", Font.BOLD, 15));
		quantidadeJTF.setBounds(110, 105, 280, 30);
		
		valor.setBounds(10, 135, 208, 50);
		valor.setFont(new Font("Arial", Font.BOLD, 15));
		valorJTF.setBounds(60, 145, 280, 30);
		
		marca.setBounds(10, 175, 208, 50);
		marca.setFont(new Font("Arial", Font.BOLD, 15));
		marcaJTF.setBounds(70, 185, 280, 30);
		
		peso.setBounds(10, 215, 208, 50);
		peso.setFont(new Font("Arial", Font.BOLD, 15));
		pesoJTF.setBounds(60, 225, 280, 30);

		anoFabricacao.setBounds(10, 255, 208, 50);
		anoFabricacao.setFont(new Font("Arial", Font.BOLD, 15));
		anoFabricacaoJTF.setBounds(140, 265, 280, 30);

		material.setBounds(10, 295, 208, 50);
		material.setFont(new Font("Arial", Font.BOLD, 15));
		materialJTF.setBounds(80, 305, 280, 30);
		
		salvar.setBounds(50, 355, 150, 40);
		excluir.setBounds(280, 355, 150, 40);
		
		janela.setLayout(null);
		
		janela.add(titulo);

		janela.add(nomePatrimonio);
		janela.add(nomePatrimonioJTF);

		janela.add(quantidade);
		janela.add(quantidadeJTF);

		janela.add(valor);
		janela.add(valorJTF);

		janela.add(marca);
		janela.add(marcaJTF);

		janela.add(peso);
		janela.add(pesoJTF);

		janela.add(anoFabricacao);
		janela.add(anoFabricacaoJTF);

		janela.add(material);
		janela.add(materialJTF);
		
		janela.add(salvar);
		janela.add(excluir);

		janela.setSize(500, 450);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		TelaGerenciamentoEquipamento teste = new TelaGerenciamentoEquipamento();
	}
}
