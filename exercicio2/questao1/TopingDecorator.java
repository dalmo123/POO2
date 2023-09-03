package questao1;

public class TopingDecorator implements Pizza {
	
	Pizza pizza;

	public TopingDecorator(Pizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public double custo(){
		return pizza.custo();
	}
	
	@Override
	public String getDescricao() {
		return pizza.getDescricao();
	}
}
