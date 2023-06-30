package view;

import controle.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class TelaGerenciamentoFilial implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastrarFilial;
	private JButton refreshFilial;
	private JList<String> listaFiliaisCadastradas;
	private String[] listaFiliais;
	private static ControleDados controleDados;
	private int qtdFiliais;

	public TelaGerenciamentoFilial(ControleDados dados) {
		controleDados = dados;
		//System.out.println(controleDados.getFiliais());
		listaFiliais = controleDados.getNomesFiliais();
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
		janela.setVisible(true);

		cadastrarFilial.addActionListener(this);
		refreshFilial.addActionListener(this);
		listaFiliaisCadastradas.addListSelectionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cadastrarFilial) {
			qtdFiliais = (new ControleFilial(controleDados)).getQtdFiliais();
			new TelaCadastroFilial(controleDados, qtdFiliais);
		} else if (e.getSource() == refreshFilial) {
			qtdFiliais = (new ControleFilial(controleDados)).getQtdFiliais();
			//System.out.println(qtdFiliais);
			listaFiliaisCadastradas.setListData(controleDados.getNomesFiliais());
			listaFiliaisCadastradas.updateUI();
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if (e.getValueIsAdjusting() && src == listaFiliaisCadastradas) {
			System.out.println(listaFiliaisCadastradas.getSelectedIndex());
			new TelaGerenciamentoPatrimonio(controleDados, listaFiliaisCadastradas.getSelectedIndex());
		}
	}
}
