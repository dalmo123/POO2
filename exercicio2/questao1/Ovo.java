package questao1;

public class Ovo extends TopingDecorator {

	public Ovo(Pizza pizza) {
		super(pizza);
	}
	
	public double custo() {
		return pizza.custo() + 6.00;
	}
	
	public String getDescricao() {
		return pizza.getDescricao() + " com ovo";
	}
}
