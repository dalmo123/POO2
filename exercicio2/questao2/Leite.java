package questao2;

public class Leite extends TopingDecorator {

	public Leite(Cafe cafe) {
		super(cafe);
	}

	@Override
	public double calculaCusto() {
		return cafe.calculaCusto()  + 5.00 ;
	}
	
	@Override
	public String getDescricao() {
		return cafe.getDescricao() + " com leite";
	}
}
