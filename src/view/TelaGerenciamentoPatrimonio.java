package view;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.Dados;
import modelo.Filial;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class TelaGerenciamentoPatrimonio{

	private JFrame janela = new JFrame();
	private JLabel titulo = new JLabel("Dados Filial");
	private JLabel nomeFilial = new JLabel("Nome Filial:");
	private JTextField nomeFilialJTF = new JTextField();
	private JLabel cnpj = new JLabel("CNPJ: ");
	private JTextField cnpjJTF = new JTextField();
	private JLabel endereco = new JLabel("Endereco: ");
	private JTextField enderecoJTF = new JTextField();
	private JButton salvar = new JButton("Salvar");
	private JButton excluir = new JButton("Excluir");
	private JList<String> listaPatrimoniosCadastrados;
	private String[] listaPatrimonios = new String[10];
	private JButton cadastrarPatrimonio = new JButton("Cadastrar Patrimonio");
	private JButton refreshPatrimonio = new JButton("Refresh");

	public TelaGerenciamentoPatrimonio(String filialSelecionada, Filial filial) {

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

		salvar.setBounds(30, 210, 150, 40);
		excluir.setBounds(300, 210, 150, 40);

		listaPatrimoniosCadastrados = new JList<>(listaPatrimonios);
		listaPatrimoniosCadastrados.setBounds(18, 270, 450, 160);
		listaPatrimoniosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaPatrimoniosCadastrados.setVisibleRowCount(10);

		cadastrarPatrimonio.setFont(new Font("Arial", Font.BOLD, 10));
		cadastrarPatrimonio.setBounds(60, 450, 150, 40);
		refreshPatrimonio.setBounds(270, 450, 150, 40);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(nomeFilial);
		janela.add(nomeFilialJTF);

		janela.add(cnpj);
		janela.add(cnpjJTF);

		janela.add(endereco);
		janela.add(enderecoJTF);

		janela.add(salvar);
		janela.add(excluir);

		janela.add(listaPatrimoniosCadastrados);

		janela.add(cadastrarPatrimonio);
		janela.add(refreshPatrimonio);

		janela.setSize(500, 550);
		janela.setVisible(true);

		//salvar.addActionListener(this);
		//excluir.addActionListener(this);
		//listaPatrimoniosCadastrados.addListSelectionListener(this);
		//cadastrarPatrimonio.addActionListener(this);
		//refreshPatrimonio.addActionListener(this);

		nomeFilialJTF.setText(filial.getNome());
		cnpjJTF.setText(filial.getCnpj());
		enderecoJTF.setText(filial.getEndereco());
		
		for (ActionListener listener : salvar.getActionListeners()) {
	        salvar.removeActionListener(listener);
	    }
		
		salvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nomeFilialJTF.getText().equals("") || cnpjJTF.getText().equals("")
						|| enderecoJTF.getText().equals("")) {
					JOptionPane.showMessageDialog(salvar, "Todos os campos precisam ser preenchidos!");
				} else {
					String novoNome = nomeFilialJTF.getText();
					String novoCNPJ = cnpjJTF.getText();
					String novoEndereco = enderecoJTF.getText();
					filial.setNome(novoNome);
					filial.setCnpj(novoCNPJ);
					filial.setEndereco(novoEndereco);
					JOptionPane.showMessageDialog(salvar, "Dados atualizados com sucesso!");
					//janela.dispose();
					//salvar.removeActionListener(this);
				}
			}
		});
		
		excluir.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
		        int selectedIndex = listaPatrimoniosCadastrados.getSelectedIndex();
		        if (selectedIndex != -1) {
		            Filial filialExcluir = Dados.escritorio.getFiliaisArrayList().get(selectedIndex);
		            Dados.escritorio.getFiliaisArrayList().remove(filialExcluir);
		            JOptionPane.showMessageDialog(excluir, "Filial removida!");
		            janela.dispose();
		        }
		    }
		});

		refreshPatrimonio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				listaPatrimoniosCadastrados.updateUI();
			}
		});

		cadastrarPatrimonio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaCadastroPatrimonio(null);
			}
		});

		listaPatrimoniosCadastrados.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					int selectedIndex = listaPatrimoniosCadastrados.getSelectedIndex();
					if (selectedIndex != -1) {
						String patrimonioSelecionado = listaPatrimonios[selectedIndex];
						new TelaCadastroPatrimonio(patrimonioSelecionado);
					}
				}
			}
		});
	}
}
/*
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == salvar) {
			if (nomeFilialJTF.getText().equals("") || cnpjJTF.getText().equals("")
					|| enderecoJTF.getText().equals("")) {
				JOptionPane.showMessageDialog(salvar, "Todos os campos precisam ser preenchidos!");
			} else {
				String novoNome = nomeFilialJTF.getText();
				String novoCNPJ = cnpjJTF.getText();
				String novoEndereco = enderecoJTF.getText();

				JOptionPane.showMessageDialog(salvar, "Dados atualizados com sucesso!");
			}

		}
		if (e.getSource() == excluir) {
			Dados.escritorio.getFiliaisArrayList().clear();
			JOptionPane.showMessageDialog(excluir, "Dados removidos!");
			janela.dispose();
		}

		if (e.getSource() == refreshPatrimonio) {
			listaPatrimoniosCadastrados.updateUI();
		}
		if (e.getSource() == cadastrarPatrimonio) {
			new TelaCadastroPatrimonio(null);
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (!e.getValueIsAdjusting()) {
			int selectedIndex = listaPatrimoniosCadastrados.getSelectedIndex();
			if (selectedIndex != -1) {
				String patrimonioSelecionado = listaPatrimonios[selectedIndex];
				new TelaCadastroPatrimonio(patrimonioSelecionado);
			}
		}

	}
}

*/
