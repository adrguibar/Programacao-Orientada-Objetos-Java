package br.com.caelum.contas.modelo;

public class Invoice {
	private String numero;
	private String descricao;
	private int quantidadeItem;
	private double precoItem;
	
	Invoice (String numero, String descricao, int quantidadeItem, double precoItem ) {
		this.numero = numero;
		this.descricao = descricao;
		
		if (quantidadeItem < 0) {
			this.quantidadeItem = 0;
		} else {
			this.quantidadeItem = quantidadeItem;
		}
		
		if (quantidadeItem < 0) {
			this.precoItem = 0.0;
		} else {
			this.precoItem = precoItem;
		}
		
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public int getQuantidadeItem() {
		return this.quantidadeItem;
	}
	
	public double getPrecoItem() {
		return this.precoItem;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setQuantidadeItem(int quantidade) {
		this.quantidadeItem = quantidade;
	}
	
	public void setPrecoItem(double preco) {
		this.precoItem = preco;
	}
	
	public double getInvoiceAmount() {
		return this.precoItem * this.quantidadeItem; 
	}
	
}
