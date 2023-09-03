package questao2;

public class Chocolate extends TopingDecorator {
	
	public Chocolate(Cafe cafe) {
		super(cafe);
	}

	@Override
	public double calculaCusto() {
		return cafe.calculaCusto()  + 11.00 ;
	}
	
	@Override
	public String getDescricao() {
		return cafe.getDescricao() + "com chocolate";
	}

}
