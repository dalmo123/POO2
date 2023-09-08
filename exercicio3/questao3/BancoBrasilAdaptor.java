package exercicio3.questao3;

public class BancoBrasilAdaptor implements Pagamento {

	
	BancoBrasil bb;
	
	public BancoBrasilAdaptor(BancoBrasil bb) {
		this.bb = bb;
	}
	
	
	@Override
	public double simularPagamentoBoleto(double valor) {
		return bb.taxaBoleto(valor);
	}

	@Override
	public double simularPagamentoCredito(double valor) {
		return bb.taxaCredito(valor);
		
	}

	@Override
	public double simularPagamentoDebito(double valor) {
		return bb.taxaDebito(valor);
		
	}


	@Override
	public double simularPagamentoEspecie(double valor) {
		return bb.taxaEspecie(valor);
	}

	
	
}
