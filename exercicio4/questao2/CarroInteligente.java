package questao2;

public class CarroInteligente {
	
	
	public static void main(String[] args) {
		
		CintoSeguranca cinto = new CintoSeguranca();
		Farol farol = new Farol();
		Motor motor = new Motor();
		Porta porta = new Porta();
		Radio radio = new Radio();
		
		CarroInteligenteFachada fachada = new CarroInteligenteFachada(cinto, farol, motor, porta, radio);
		
		
		fachada.dirigir("FM 107.1");
		System.out.println("------");
		fachada.finalizarCorrida();
		
		
		
	}

}
