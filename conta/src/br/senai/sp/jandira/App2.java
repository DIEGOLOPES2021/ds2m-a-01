package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
//		 cliente
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro");
		pedro.setCpf("44476598732");
		pedro.setTelefone("941452714");
		pedro.setCep("567877897");
		
//		conta
		
		Conta contaPedro = new Conta();
		contaPedro.setTitular(pedro);
		contaPedro.depositar(100);
		contaPedro.setNumero("222-1");
		
		System.out.println(contaPedro.getTitular().getTelefone());
		System.out.println(contaPedro.getTitular().getNome());
		contaPedro.getTitular().setNome("Diego Lopes");
		System.out.println(contaPedro.getTitular().getNome());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
