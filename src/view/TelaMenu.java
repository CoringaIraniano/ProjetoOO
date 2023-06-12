package view;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class TelaMenu implements ActionListener {
	private static JFrame janela = new JFrame("Gerencia Patrimonial");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton gerenciarFiliais = new JButton("Gerenciar Filiais");
	private static JButton listarPatrimonios = new JButton("Listar Patrimonios");
	private static JButton buscarPatrimonio = new JButton("Buscar Patrimonio");
	
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(171, 15, 150, 50);
		gerenciarFiliais.setBounds(140, 90, 208, 50);
		listarPatrimonios.setBounds(140, 160, 208, 50);
		buscarPatrimonio.setBounds(140, 230, 208, 50);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(gerenciarFiliais);
		janela.add(listarPatrimonios);
		janela.add(buscarPatrimonio);
		
		janela.setSize(500,350);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu Telamenu = new TelaMenu();
		gerenciarFiliais.addActionListener(Telamenu);
		listarPatrimonios.addActionListener(Telamenu);
		buscarPatrimonio.addActionListener(Telamenu);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == gerenciarFiliais) {
			new TelaGerenciamentoFilial();
		}
		if(e.getSource() == listarPatrimonios) {
		
		}
		if(e.getSource() == buscarPatrimonio) {
			new BuscaPatrimonio();
		}
		
	}
}
