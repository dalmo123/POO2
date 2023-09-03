package questao1;

public class Tomate extends TopingDecorator{
	
	public Tomate(Pizza pizza) {
		super(pizza);
	}
	
	public double custo() {
		return pizza.custo() + 7.50;
	}
	
	public String getDescricao() {
		return pizza.getDescricao() + " com tomate";
	}
	

}
