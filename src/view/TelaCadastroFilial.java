package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class TelaCadastroFilial implements ActionListener {

	private static JFrame janela = new JFrame();
	private static JLabel titulo = new JLabel("Dados Filial");
	private static JLabel nomeFilial = new JLabel("Nome Filial:");
	private static JTextField nomeFilialJTF = new JTextField();
	private static JLabel cnpj = new JLabel("CNPJ: ");
	private static JTextField cnpjJTF = new JTextField();
	private static JLabel endereco = new JLabel("Endereco: ");
	private static JTextField enderecoJTF = new JTextField();
	private static JButton cadastrar = new JButton("Cadastrar");
	
	public TelaCadastroFilial() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(180, 10, 208, 50);
		
		nomeFilial.setBounds(10, 75, 208, 50);
		nomeFilial.setFont(new Font("Arial", Font.BOLD, 15));
		nomeFilialJTF.setBounds(100, 85, 280, 30);
		
		cnpj.setBounds(10, 115, 208, 50);
		cnpj.setFont(new Font("Arial", Font.BOLD, 15));
		cnpjJTF.setBounds(60, 125, 280, 30);
		
		endereco.setBounds(10, 155, 208, 50);
		endereco.setFont(new Font("Arial", Font.BOLD, 15));
		enderecoJTF.setBounds(90, 165, 280, 30);
		
		cadastrar.setBounds(160, 210, 150, 40);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(nomeFilial);
		janela.add(nomeFilialJTF);
		
		janela.add(cnpj);
		janela.add(cnpjJTF);
		
		janela.add(endereco);
		janela.add(enderecoJTF);
		
		janela.add(cadastrar);
		
		janela.setSize(500,300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
