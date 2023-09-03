package questao2;

public class TopingDecorator implements Cafe {

	Cafe cafe;
	
	public TopingDecorator(Cafe cafe) {
		this.cafe = cafe;
	}
	
	@Override
	public double calculaCusto() {
		return cafe.calculaCusto();
	}
	
	@Override
	public String getDescricao() {
		return cafe.getDescricao();
	}
}
