package questao2;

public class Descafeinado implements Cafe {
	
	@Override
	public double calculaCusto() {
		return 10.00;
	}
	
	@Override
	public String getDescricao() {
		return "Cafe descafeinado";
	}

}