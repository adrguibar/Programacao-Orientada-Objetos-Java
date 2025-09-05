package br.com.caelum.contas.modelo;

public class PessoaFisica {
	private String cpf;
	
	PessoaFisica (String cpf) {
		if (!this.validaCpf(cpf)) {
			throw new IllegalArgumentException("CPF Invalido");
		}
		this.cpf = cpf;
	}
	
	private boolean validaCpf(String cpf){
		if (cpf == null || cpf.length() != 11) {
			return false;
		}
		for (char c: cpf.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	public String getCpf() {
		return this.cpf;
	}
}
