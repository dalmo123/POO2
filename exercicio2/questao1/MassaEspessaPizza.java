package questao1;

public class MassaEspessaPizza implements Pizza {

	@Override
	public double custo() {
		return 45.00;
	}
	
	@Override
	public String getDescricao() {
		return "Pizza massa espessa";
	}
}
