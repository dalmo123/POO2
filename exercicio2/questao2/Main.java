package questao2;

public class Main {
	
	public static void main(String[] args) {
		
		Cafe espresso = new Espresso();
		Cafe espressoChocolate = new Chocolate(espresso);
		Cafe espressoChocolateLeite = new Leite(espressoChocolate);
		
		System.out.println("Preco: " + espressoChocolateLeite.calculaCusto());
		System.out.println(espressoChocolateLeite.getDescricao()+".");
		
		System.out.println("------------------------");
		
		Cafe descafeinado = new Descafeinado();
		Cafe descafeinadoCanela = new Canela(descafeinado);
		
		System.out.println("Preco: " + descafeinadoCanela.calculaCusto());
		System.out.println(descafeinadoCanela.getDescricao()+".");
		
		
	}

}
