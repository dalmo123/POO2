package exercicio3.questao3;

public class AgenciaBancoBrasil implements BancoBrasil {

	@Override
	public double taxaBoleto(double valor) {
		return valor * 1.1;
	}

	@Override
	public double taxaCredito(double valor) {
		return valor * 1.35;
	}

	@Override
	public double taxaDebito(double valor) {
		return valor * 1.20 ;
	}

	@Override
	public double taxaEspecie(double valor) {
		return valor;
	}

}
