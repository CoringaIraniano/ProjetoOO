package view;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class BuscaPatrimonio implements ActionListener {
	private JFrame janela = new JFrame("Busca Patrimonio");
	private JLabel buscaPatrimonio = new JLabel("Buscar Patrimonio: ");
	private JTextField buscaPatrimonioJTF = new JTextField();
	private JButton botaoBuscar = new JButton("Buscar");
	
	
	public BuscaPatrimonio() {
		buscaPatrimonio.setFont(new Font("Arial", Font.BOLD, 15));
		buscaPatrimonio.setBounds(10, 10, 180, 50);
		buscaPatrimonioJTF.setBounds(160, 20, 250, 30);
		botaoBuscar.setBounds(160, 65, 150, 40);
		
		janela.setLayout(null);
		
		janela.add(buscaPatrimonio);
		janela.add(buscaPatrimonioJTF);
		janela.add(botaoBuscar);
		
		janela.setSize(500,160);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
