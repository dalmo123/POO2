package exercicio3.questao3;

public interface PayPal {
	
	double taxaBoleto(double valor);
	
	double taxaCredito(double valor);
	
	double taxaDebito(double valor);
}
