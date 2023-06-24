package view.provisorio;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaGerenciamentoEletronico {
	private JFrame janela = new JFrame("Dados Patrimonio");
	private JLabel titulo = new JLabel("Eletronico");
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
	private JLabel voltagem = new JLabel("Voltagem: ");
	private JTextField voltagemJTF = new JTextField();
	private JLabel sistema = new JLabel("Sistema: ");
	private JTextField sistemaJTF = new JTextField();
	private JLabel modelo = new JLabel("Modelo: ");
	private JTextField modeloJTF = new JTextField();
	private JButton excluir = new JButton("Excluir");
	private JButton salvar = new JButton("Salvar");

	
	public TelaGerenciamentoEletronico() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(190, 8, 208, 50);
		
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
		
		voltagem.setBounds(10, 255, 208, 50);
		voltagem.setFont(new Font("Arial", Font.BOLD, 15));
		voltagemJTF.setBounds(90, 265, 280, 30);
		
		sistema.setBounds(10, 295, 208, 50);
		sistema.setFont(new Font("Arial", Font.BOLD, 15));
		sistemaJTF.setBounds(80, 305, 280, 30);
		
		modelo.setBounds(10, 335, 208, 50);
		modelo.setFont(new Font("Arial", Font.BOLD, 15));
		modeloJTF.setBounds(80, 345, 280, 30);
		
		salvar.setBounds(50, 395, 150, 40);
		excluir.setBounds(280, 395, 150, 40);

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
		
		janela.add(voltagem);
		janela.add(voltagemJTF);
		
		janela.add(sistema);
		janela.add(sistemaJTF);
		
		janela.add(modelo);
		janela.add(modeloJTF);
		
		janela.add(salvar);
		janela.add(excluir);

		janela.setSize(500, 500);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaGerenciamentoEletronico teste = new TelaGerenciamentoEletronico();
	}
}
