package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Data;
import br.com.caelum.contas.modelo.Conta;

public class TesteConta {
	public static void main(String[] args) {
		
		Data dataAbertura = new Data();
		dataAbertura.dia = 21;
		dataAbertura.mes = 07;
		dataAbertura.ano = 2025;
		
		Conta c1 = new Conta("Adriano guimaraes");
		
		Conta c2 = new Conta("maria");
				
		System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println("\n");
		System.out.println(c2.recuperaDadosParaImpressao());
	}
}
