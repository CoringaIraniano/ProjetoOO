package view;
import modelo.*;
import controle.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class TelaCadastroFilial {

	private JFrame janela = new JFrame();
	private JLabel titulo = new JLabel("Dados Filial");
	private JLabel nomeFilial = new JLabel("Nome Filial:");
	private JTextField nomeFilialJTF = new JTextField();
	private JLabel cnpj = new JLabel("CNPJ: ");
	private JTextField cnpjJTF = new JTextField();
	private JLabel endereco = new JLabel("Endereco: ");
	private JTextField enderecoJTF = new JTextField();
	private JButton cadastrar = new JButton("Cadastrar");
	
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
		janela.setVisible(true);
		
		cadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == cadastrar) {
					nomeFilialJTF.getText();
					cnpjJTF.getText();
					enderecoJTF.getText();
					if (nomeFilialJTF.getText().equals("") || cnpjJTF.getText().equals("") || enderecoJTF.getText().equals("")) {
						JOptionPane.showMessageDialog(cadastrar, "Todos os campos precisam ser preenchidos!");
					} else {
						Filial novaFilial = new Filial(null, null, null);
						novaFilial.setNome(nomeFilialJTF.getText());
						novaFilial.setCnpj(cnpjJTF.getText());
						novaFilial.setEndereco(enderecoJTF.getText());
						Dados.escritorio.getFiliaisArrayList().add(novaFilial);
						JOptionPane.showMessageDialog(cadastrar, "Dados cadastrados com sucesso!");
						janela.dispose();
					}
					
				}
				
			}
		});	
	}



}
