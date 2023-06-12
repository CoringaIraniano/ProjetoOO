package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*; 

public class TelaCadastroPatrimonio implements ActionListener {

	private static JFrame janela = new JFrame();
	private static JLabel titulo = new JLabel("Dados Patrimonio");
	private static JButton botaoVeiculo = new JButton("Veiculo");
	private static JButton botaoEletronico = new JButton("Eletronico");
	private static JButton botaoEquipamento = new JButton("Equipamento");
	private static JLabel nomePatrimonio = new JLabel("Nome Patrimonio:");
	private static JTextField nomePatrimonioJTF = new JTextField();
	private static JLabel quantidade = new JLabel("Quantidade: ");
	private static JTextField quantidadeJTF = new JTextField();
	private static JLabel valor = new JLabel("Valor: ");
	private static JTextField valorJTF = new JTextField();
	private static JLabel marca = new JLabel("Marca: ");
	private static JTextField marcaJTF = new JTextField();
	private static JLabel peso = new JLabel("Peso: ");
	private static JTextField pesoJTF = new JTextField();
	private static JLabel voltagem = new JLabel("Voltagem: ");
	private static JTextField voltagemJTF = new JTextField();
	private static JLabel sistema = new JLabel("Sistema: ");
	private static JTextField sistemaJTF = new JTextField();
	private static JLabel modelo = new JLabel("Modelo: ");
	private static JTextField modeloJTF = new JTextField();
	private static JButton cadastrar = new JButton("Cadastrar");
	private static JButton voltar = new JButton("Voltar");
	
	public TelaCadastroPatrimonio(String patrimonioSelecionado) {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(150, 10, 208, 50);
		
		botaoVeiculo.setBounds(5, 80, 150, 40);
		botaoEletronico.setBounds(170, 80, 150, 40);
		botaoEquipamento.setBounds(330, 80, 150, 40);
		
		nomePatrimonio.setBounds(10, 125, 208, 50);
		nomePatrimonio.setFont(new Font("Arial", Font.BOLD, 15));
		nomePatrimonioJTF.setBounds(150, 135, 280, 30);
		
		quantidade.setBounds(10, 165, 208, 50);
		quantidade.setFont(new Font("Arial", Font.BOLD, 15));
		quantidadeJTF.setBounds(110, 175, 280, 30);
		
		valor.setBounds(10, 205, 208, 50);
		valor.setFont(new Font("Arial", Font.BOLD, 15));
		valorJTF.setBounds(60, 215, 280, 30);
		
		marca.setBounds(10, 245, 208, 50);
		marca.setFont(new Font("Arial", Font.BOLD, 15));
		marcaJTF.setBounds(70, 255, 280, 30);
		
		peso.setBounds(10, 285, 208, 50);
		peso.setFont(new Font("Arial", Font.BOLD, 15));
		pesoJTF.setBounds(60, 295, 280, 30);
		
		voltagem.setBounds(10, 325, 208, 50);
		voltagem.setFont(new Font("Arial", Font.BOLD, 15));
		voltagemJTF.setBounds(90, 335, 280, 30);
		
		sistema.setBounds(10, 365, 208, 50);
		sistema.setFont(new Font("Arial", Font.BOLD, 15));
		sistemaJTF.setBounds(80, 375, 280, 30);
		
		modelo.setBounds(10, 405, 208, 50);
		modelo.setFont(new Font("Arial", Font.BOLD, 15));
		modeloJTF.setBounds(80, 415, 280, 30);
		
		cadastrar.setBounds(30, 500, 150, 40);
		voltar.setBounds(290, 500, 150, 40);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(botaoVeiculo);
		janela.add(botaoEletronico);
		janela.add(botaoEquipamento);
		
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
		
		janela.add(cadastrar);
		janela.add(voltar);
		
		janela.setSize(500,600);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
