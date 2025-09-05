package br.com.caelum.contas.modelo;
import java.time.LocalDate;


public class Conta {
	private String nomeTitular;
	private int numero;
	private int agencia;
	private double saldo;
	private LocalDate dataAbertura;
	private int identificador;
	private static int proximoIdentificador = 1;
	
	public Conta(String nome) {
		this.nomeTitular = nome; 
		this.dataAbertura = LocalDate.now();
		this.saldo = 0;
		this.identificador = proximoIdentificador;
		proximoIdentificador++;
	}
	
	public void setNomeTitular(String nome) {
		this.nomeTitular = nome;
	}
	
	public String getNomeTitular() {
		return this.nomeTitular;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	boolean deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	
	double getRendimento() {
		double rendimento = this.saldo * 1.1;
		return rendimento;
	}
	
	public String recuperaDadosParaImpressao() {
		
		return "Nome do Titular: " + this.nomeTitular + "\n"
			   + "Numero da conta: " + this.numero + "\n"
			   + "Agencia: " + this.agencia + "\n"
			   + "Data Abertura: " + this.dataAbertura + "\n"
			   + "Saldo: " + this.saldo + "\n"
			   + "Rendimento: R$" + String.format("%.2f", this.getRendimento()) + "\n"
			   + "Identificador: " + this.identificador;
	}

}

