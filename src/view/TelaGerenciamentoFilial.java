package view;
import controle.*;
import modelo.Filial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
	private DefaultListModel<String> modelFiliais;
	private String[] listaFiliais = new String[10];
	
	public TelaGerenciamentoFilial() {
			listaFiliaisCadastradas = new JList<String>(listaFiliais);
			modelFiliais = new DefaultListModel<>();
			listaFiliaisCadastradas = new JList<>(modelFiliais);
			listaFiliaisCadastradas.setModel(modelFiliais);
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
			janela.setVisible(true);
			
			listaFiliaisCadastradas.addListSelectionListener(this);
			cadastrarFilial.addActionListener(this);
			refreshFilial.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cadastrarFilial) {
			new TelaCadastroFilial();
		}
		if(e.getSource() == refreshFilial) {
			modelFiliais.clear();
		    ArrayList<Filial> filiais = Dados.escritorio.getFiliaisArrayList();
		    for (Filial filial : filiais) {
		        modelFiliais.addElement(filial.getNome());
		    }

		    listaFiliaisCadastradas.setModel(modelFiliais);	
		}
		
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (!e.getValueIsAdjusting()) {
			int pos = listaFiliaisCadastradas.getSelectedIndex();
			if (pos != -1) {
				 String filialSelecionada = listaFiliais[pos];
				 Filial filial = Dados.escritorio.getFiliaisArrayList().get(pos);
				 new TelaGerenciamentoPatrimonio(filialSelecionada, filial);
			}
		}
		
	}
}
