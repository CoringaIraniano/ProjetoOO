package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*; 

public class TelaGerenciamentoFilial implements ActionListener, ListSelectionListener {
	private static JFrame janela;
	private static JLabel titulo;
	private static JButton cadastrarFilial;
	private static JButton refreshFilial;
	private static JList<String> listaFiliaisCadastradas;
	private String[] listaFiliais = new String[10];
	
	public TelaGerenciamentoFilial() {
			listaFiliaisCadastradas = new JList<String>(listaFiliais);
			janela = new JFrame("Gerenciamento Filiais");
			titulo = new JLabel("Filiais Cadastradas");
			cadastrarFilial = new JButton("Cadastrar Filial");
			refreshFilial = new JButton("Refresh");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(105, 10, 200, 50);
			listaFiliaisCadastradas.setBounds(15, 70, 355, 160);
			listaFiliaisCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaFiliaisCadastradas.setVisibleRowCount(10);
			cadastrarFilial.setFont(new Font("Arial", Font.BOLD, 13));
			cadastrarFilial.setBounds(15, 250, 130, 40);
			refreshFilial.setFont(new Font("Arial", Font.BOLD, 13));
			refreshFilial.setBounds(240, 250, 130, 40);
			
			janela.setLayout(null);
			
			janela.add(titulo);
			janela.add(listaFiliaisCadastradas);
			janela.add(cadastrarFilial);
			janela.add(refreshFilial);
			
			janela.setSize(400, 350);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);
			
			listaFiliaisCadastradas.addListSelectionListener(this);
			cadastrarFilial.addActionListener(this);
			refreshFilial.addActionListener(this);
			
			listaFiliais[0] = "Filial 1";
		    listaFiliais[1] = "Filial 2";
		    listaFiliais[2] = "Filial 3";
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cadastrarFilial) {
			new TelaCadastroFilial();
		}
		if(e.getSource() == refreshFilial) {
			listaFiliaisCadastradas.updateUI();
		}
		
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (!e.getValueIsAdjusting()) {
			int selectedIndex = listaFiliaisCadastradas.getSelectedIndex();
			if (selectedIndex != -1) {
				 String filialSelecionada = listaFiliais[selectedIndex];
				 new TelaGerenciamentoPatrimonio(filialSelecionada);
			}
		}
		
	}
}
