package exercicio3.questao3;

//Descrição: Tenho uma aplicação que calcula taxas de pagamentos em diferentes bancos, PayPal e BancoBrasil, no entanto, tanto o banco PayPal
//quanto o banco brasil possuem taxas diferentes, ou seja, interfaces diferentes.
//Por isso, utilizamos o padrao de projeto adapter, para adaptar a interface Pagamento as interfaces dos respectivos bancos(BB e PayPal).


public class Main {
	
	public static void main(String[] args) {
		
		BancoBrasil bb = new AgenciaBancoBrasil();
		Pagamento simulaBB = new BancoBrasilAdaptor(bb);
		
		System.out.println("Banco Brasil");
		simulador(simulaBB,500);
		System.out.println("----------");
		
		
		PayPal PayPal = new AplicativoPayPal();
		Pagamento simulaPayPal = new PayPalAdaptor(PayPal);
		
		System.out.println("PayPal");
		simulador(simulaPayPal, 500);
		
		
		
	}



static public void simulador(Pagamento pg, double valor) {
	System.out.println("Boleto: " + pg.simularPagamentoBoleto(valor));
	System.out.println("Credito: " + pg.simularPagamentoCredito(valor));
	System.out.println("Debito: " + pg.simularPagamentoDebito(valor));
	System.out.println("Especie: " + pg.simularPagamentoEspecie(valor));
}

}