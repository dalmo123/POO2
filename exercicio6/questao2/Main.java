
public class Main {
	
	 public static void main(String[] args) {
	        System.out.println("Preparando um cafe:");
	        Cafe cafe = new Cafe();
	        cafe.prepararBebida();

	        System.out.println("\nPreparando um capuccino:");
	        Capuccino capuccino = new Capuccino();
	        capuccino.prepararBebida();

	        System.out.println("\nPreparando um cha:");
	        Cha cha = new Cha();
	        cha.prepararBebida();
	    }
}
