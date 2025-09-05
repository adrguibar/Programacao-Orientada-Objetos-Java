package br.com.caelum.contas.modelo;

public class TesteInvoice {
	public static void main(String [] args) {
		Invoice invoice1 = new Invoice("1", "invoice1", 3, 5.4);
		
		System.out.printf("%.2f", invoice1.getInvoiceAmount());
	}
}
