package questao1;

public class MassaFinaPizza implements Pizza {

	@Override
	public double custo() {
		return 35.00;
	}
	
	@Override
	public String getDescricao() {
		return "Pizza massa fina";
	}
}
