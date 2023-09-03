package questao2;

public class Espresso implements Cafe {
	
	@Override	
	public double calculaCusto() {
		return 15.00;
	}
	
	@Override
	public String getDescricao() {
		return "Cafe espresso ";
	}

	
	

}
