package exercicio3.questao3;

public class PayPalAdaptor implements Pagamento {
	
	PayPal PayPal;
	
	public PayPalAdaptor(PayPal paypal) {
		this.PayPal = paypal;
	}

	@Override
	public double simularPagamentoBoleto(double valor) {
		return PayPal.taxaBoleto(valor);
	}

	@Override
	public double simularPagamentoCredito(double valor) {
		return PayPal.taxaCredito(valor);
	}

	@Override
	public double simularPagamentoDebito(double valor) {
		return PayPal.taxaDebito(valor);
	}

	@Override
	public double simularPagamentoEspecie(double valor) {
		System.out.println("PAYPAL nao aceita pagamento em especie..");
		return 0;
	}


	
}
