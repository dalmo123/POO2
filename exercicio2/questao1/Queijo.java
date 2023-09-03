package questao1;

public class Queijo extends TopingDecorator {

	public Queijo(Pizza pizza) {
		super(pizza);
	}
	
	public double custo() {
		return pizza.custo() + 10.00;
	}
	
	public String getDescricao() {
		return pizza.getDescricao() + " e queijo.";
	}
	
}
