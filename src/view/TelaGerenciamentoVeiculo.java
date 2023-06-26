package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.*;
import modelo.Veiculo;

public class TelaGerenciamentoVeiculo implements ActionListener {
	private JFrame janela = new JFrame("Edicao Veiculo");
	private JLabel titulo = new JLabel("Veiculo");
	private JLabel nomePatrimonio = new JLabel("Nome Patrimonio:");
	private JTextField nomePatrimonioJTF = new JTextField();
	private JLabel quantidade = new JLabel("Quantidade: ");
	private JTextField quantidadeJTF = new JTextField();
	private JLabel valor = new JLabel("Valor: ");
	private JTextField valorJTF = new JTextField();
	private JLabel marca = new JLabel("Marca: ");
	private JTextField marcaJTF = new JTextField();
	private JLabel tipoVeiculo = new JLabel("Tipo Veiculo: ");
	private JTextField tipoVeiculoJTF = new JTextField();
	private JLabel corVeiculo = new JLabel("Cor: ");
	private JTextField corVeiculoJTF = new JTextField();
	private JLabel quantidadePortas = new JLabel("Quantidade de Portas: ");
	private JTextField quantidadePortasJTF = new JTextField();
	private JButton excluir = new JButton("Excluir");
	private JButton salvar = new JButton("Salvar");
	private int indicePatrimonioSelecionado;
	private int indiceFilialSelecionada;
	private Dados controleDados;

	public TelaGerenciamentoVeiculo(Dados controleDados, int indexFilial, int index) {
		this.controleDados = controleDados;
		this.indiceFilialSelecionada = indexFilial;
		this.indicePatrimonioSelecionado = index;

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(200, 0, 208, 50);

		nomePatrimonio.setBounds(10, 45, 208, 50);
		nomePatrimonio.setFont(new Font("Arial", Font.BOLD, 15));
		nomePatrimonioJTF.setBounds(150, 55, 280, 30);

		quantidade.setBounds(10, 85, 208, 50);
		quantidade.setFont(new Font("Arial", Font.BOLD, 15));
		quantidadeJTF.setBounds(110, 95, 280, 30);

		valor.setBounds(10, 125, 208, 50);
		valor.setFont(new Font("Arial", Font.BOLD, 15));
		valorJTF.setBounds(60, 135, 280, 30);

		marca.setBounds(10, 165, 208, 50);
		marca.setFont(new Font("Arial", Font.BOLD, 15));
		marcaJTF.setBounds(70, 175, 280, 30);

		tipoVeiculo.setBounds(10, 205, 208, 50);
		tipoVeiculo.setFont(new Font("Arial", Font.BOLD, 15));
		tipoVeiculoJTF.setBounds(115, 215, 280, 30);

		corVeiculo.setBounds(10, 245, 208, 50);
		corVeiculo.setFont(new Font("Arial", Font.BOLD, 15));
		corVeiculoJTF.setBounds(50, 255, 280, 30);

		quantidadePortas.setBounds(10, 285, 208, 50);
		quantidadePortas.setFont(new Font("Arial", Font.BOLD, 15));
		quantidadePortasJTF.setBounds(185, 295, 280, 30);

		salvar.setBounds(50, 350, 150, 40);
		excluir.setBounds(280, 350, 150, 40);

		janela.setLayout(null);

		janela.add(titulo);

		janela.add(nomePatrimonio);
		janela.add(nomePatrimonioJTF);

		janela.add(quantidade);
		janela.add(quantidadeJTF);

		janela.add(valor);
		janela.add(valorJTF);

		janela.add(marca);
		janela.add(marcaJTF);

		janela.add(tipoVeiculo);
		janela.add(tipoVeiculoJTF);

		janela.add(corVeiculo);
		janela.add(corVeiculoJTF);

		janela.add(quantidadePortas);
		janela.add(quantidadePortasJTF);

		janela.add(salvar);
		janela.add(excluir);

		janela.setSize(500, 450);
		janela.setVisible(true);
		
		salvar.addActionListener(this);
		excluir.addActionListener(this);

		nomePatrimonioJTF.setText(controleDados.getFilial(indiceFilialSelecionada).getPatrimonio().get(index).getNomeItem());
		quantidadeJTF.setText(String.valueOf(controleDados.getFilial(indiceFilialSelecionada).getPatrimonio().get(index).getQuantidade()));
		valorJTF.setText(String.valueOf(controleDados.getFilial(indiceFilialSelecionada).getPatrimonio().get(index).getValor()));
		marcaJTF.setText(controleDados.getFilial(indiceFilialSelecionada).getPatrimonio().get(index).getMarca());
		tipoVeiculoJTF.setText(((Veiculo) controleDados.getFilial(indiceFilialSelecionada).getPatrimonio().get(index)).getTipoVeiculo());
		corVeiculoJTF.setText(((Veiculo) controleDados.getFilial(indiceFilialSelecionada).getPatrimonio().get(index)).getCor());
		quantidadePortasJTF.setText(
				String.valueOf(((Veiculo) controleDados.getFilial(indiceFilialSelecionada).getPatrimonio().get(index)).getQtdPortas()));

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == salvar) {
			if (nomePatrimonioJTF.getText().equals("") || quantidadeJTF.getText().equals("")
					|| valorJTF.getText().equals("") || marcaJTF.getText().equals("")
					|| tipoVeiculoJTF.getText().equals("") || corVeiculoJTF.getText().equals("")
					|| quantidadePortasJTF.getText().equals("")) {
				JOptionPane.showMessageDialog(salvar, "Todos os campos precisam ser preenchidos!");
			} else {
				String novoNome = nomePatrimonioJTF.getText();
				String novaQuantidade = quantidadeJTF.getText();
				String novoValor = valorJTF.getText();
				String novaMarca = marcaJTF.getText();
				String novoTipoVeiculo = tipoVeiculoJTF.getText();
				String novaCorVeiculo = corVeiculoJTF.getText();
				String novaQtdPortas = quantidadePortasJTF.getText();
				controleDados.cadastrarEditarPatrimonioVeiculo(novoNome, novaQuantidade, novoValor, novaMarca,
						novoTipoVeiculo, novaCorVeiculo, novaQtdPortas, indiceFilialSelecionada, indicePatrimonioSelecionado);
				JOptionPane.showMessageDialog(salvar, "Patrimonio atualizado com sucesso!");
				janela.dispose();
			}
		} else if (e.getSource() == excluir) {
			controleDados.excluirPatrimonio(indiceFilialSelecionada, indicePatrimonioSelecionado);
			JOptionPane.showMessageDialog(excluir, "Patrimonio removido com sucesso!");
			janela.dispose();
		}
	}
}