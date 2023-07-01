package view;

import java.awt.event.*;
import controle.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class TelaBuscaPatrimonio implements ActionListener, ListSelectionListener {
    private JFrame janela;
    private JLabel buscaPatrimonio;
    private JTextField buscaPatrimonioJTF;
    private JButton botaoBuscar;
    private JList<String> listaPatrimoniosVinculados;
    private JScrollPane scrollPane;
    private String[] listaNomesPatrimonios;
    private ControleDados controleDados;
	private int indiceFilialSelecionada;

    public TelaBuscaPatrimonio(ControleDados controleDados) {
        this.controleDados = controleDados;
        
        janela = new JFrame("Busca Patrimonio");
        buscaPatrimonio = new JLabel("Buscar Patrimonio: ");
        buscaPatrimonioJTF = new JTextField();
        botaoBuscar = new JButton("Buscar");

        buscaPatrimonio.setFont(new Font("Arial", Font.BOLD, 15));
        buscaPatrimonio.setBounds(10, 10, 180, 50);
        buscaPatrimonioJTF.setBounds(160, 20, 250, 30);
        botaoBuscar.setBounds(415, 20, 100, 30);

        listaNomesPatrimonios = new ControlePatrimonio(controleDados).getNomesPatrimonios();
        listaPatrimoniosVinculados = new JList<>(listaNomesPatrimonios);
        scrollPane = new JScrollPane(listaPatrimoniosVinculados);
        scrollPane.setBounds(18, 75, 490, 250);
        listaPatrimoniosVinculados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaPatrimoniosVinculados.setVisibleRowCount(10);

        janela.setLayout(null);

        janela.add(buscaPatrimonio);
        janela.add(buscaPatrimonioJTF);
        janela.add(botaoBuscar);
        janela.add(scrollPane);

        janela.setBounds(1000, 140, 540, 385);
        janela.setVisible(true);

        botaoBuscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

    @Override
	public void valueChanged(ListSelectionEvent e) {
		
	}

}
