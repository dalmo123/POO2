package exercicio3.questao3;

public class AplicativoPayPal implements PayPal{

	@Override
	public double taxaBoleto(double valor) {
		return valor;
	}

	@Override
	public double taxaCredito(double valor) {
		return valor * 1.15;
	}

	@Override
	public double taxaDebito(double valor) {
		return valor * 1.10;
	}

	
	
}
