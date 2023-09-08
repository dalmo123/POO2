package exercicio3.questao3;

public interface Pagamento {

	double simularPagamentoBoleto(double valor);
	
	double simularPagamentoCredito(double valor);
	
	double simularPagamentoDebito(double valor);

	double simularPagamentoEspecie(double valor);
}
