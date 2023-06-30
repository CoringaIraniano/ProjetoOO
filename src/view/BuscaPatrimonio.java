package view;

import java.awt.event.*;
import controle.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class BuscaPatrimonio implements ActionListener, ListSelectionListener {
	private JFrame janela = new JFrame("Busca Patrimonio");
	private JLabel buscaPatrimonio = new JLabel("Buscar Patrimonio: ");
	private JTextField buscaPatrimonioJTF = new JTextField();
	private JButton botaoBuscar = new JButton("Buscar");
	private JList<String> listaPatrimoniosVinculados;
	private String[] listaNomesPatrimonios;
	private JButton botaoListar = new JButton("Listar Patrimonios");
	// private ControleDados controleDados;
	private int qtdPatrimonios;

	public BuscaPatrimonio(ControleDados controleDados) {
		// this.controleDados = controleDados;

		buscaPatrimonio.setFont(new Font("Arial", Font.BOLD, 15));
		buscaPatrimonio.setBounds(10, 10, 180, 50);
		buscaPatrimonioJTF.setBounds(160, 20, 250, 30);
		botaoBuscar.setBounds(160, 65, 150, 40);

		listaNomesPatrimonios = new ControlePatrimonio(controleDados).getNomesPatrimonios();
		listaPatrimoniosVinculados = new JList<>(listaNomesPatrimonios);
		listaPatrimoniosVinculados.setBounds(18, 130, 450, 250);
		listaPatrimoniosVinculados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaPatrimoniosVinculados.setVisibleRowCount(10);

		botaoListar.setBounds(160, 400, 150, 40);

		janela.setLayout(null);

		janela.add(buscaPatrimonio);
		janela.add(buscaPatrimonioJTF);
		janela.add(botaoBuscar);
		janela.add(listaPatrimoniosVinculados);
		janela.add(botaoListar);

		janela.setSize(500, 500);
		janela.setVisible(true);

		botaoListar.addActionListener(this);
		botaoBuscar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoListar) {
			// qtdPatrimonios = (new ControlePatrimonio(controleDados)).getQtdPatrimonios();
			// listaPatrimonios = new
			// ControlePatrimonio(controleDados).getNomesPatrimonios(); // Atualiza a lista
			// de patrimônios
			// listaPatrimoniosVinculados.setListData(listaPatrimonios);
			// listaPatrimoniosVinculados.updateUI();
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}
}
