package testes;

import controle.*;
import modelo.Escritorio;
import modelo.Filial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testEditarCadastrarFilial() {
		ControleDados d = new ControleDados();
		String nomeFilial = "Filial1";
		String cnpjFilialerrado = "123.456.789/0001-12";
		String cnpjFilialcorreto = "1234567891234567";
		String enderecoFilial = "Endereco1";
		int index = 0;

		assertTrue(d.editarCadastrarFilial(nomeFilial, cnpjFilialcorreto, enderecoFilial, index));
		assertFalse(d.editarCadastrarFilial(nomeFilial, cnpjFilialerrado, enderecoFilial, index));

	}

}
