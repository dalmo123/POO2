package questao2;

public class Canela extends TopingDecorator {

	public Canela(Cafe cafe) {
		super(cafe);
	}
	
	@Override
	public double calculaCusto() {
		return cafe.calculaCusto()  + 7.00 ;
	}
	
	@Override
	public String getDescricao() {
		return cafe.getDescricao() + " com canela";
	}
		
}
