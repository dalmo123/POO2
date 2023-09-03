package questao1;

public class Pizzaria {
	
	
	public static void main(String[] args) {
		
		Pizza massaFina = new MassaFinaPizza();
		Pizza margheritaComTomate = new Tomate(massaFina);
		Pizza margheritaCompleta = new Queijo(margheritaComTomate);
		
		System.out.println("Preco da Margherita: " + margheritaCompleta.custo());
		System.out.println(margheritaCompleta.getDescricao());
		
		System.out.println("---------------------------------");
		
		Pizza massaEspessa = new MassaEspessaPizza();
		Pizza portuguesaOvo = new Ovo(massaEspessa);
		Pizza portuguesaOvoTomate = new Tomate(portuguesaOvo);
		Pizza portuguesa = new Queijo(portuguesaOvoTomate);
		
		System.out.println("Preco da Portuguesa: " + portuguesa.custo());
		System.out.println(portuguesa.getDescricao());
		
	}

}
