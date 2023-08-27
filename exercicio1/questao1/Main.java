package questao1;

public class Main {

	public static void main(String[] args) {

		System.out.println("Celulares da APPLE..");

		// utilizicao do padrao singleton
		FabricanteCelular apple = FabricanteCelularSingleton.getInstance("apple");

		// utilizacao do padrao fabrica
		Celular iphones = apple.constroiCelular("iphones");

		iphones.fazLigacao();
		iphones.tiraFoto();

		System.out.println("ok iphones..");

		// utilizacao do padrao fabrica
		Celular iphonex = apple.constroiCelular("iphonex");

		iphonex.fazLigacao();
		iphonex.tiraFoto();

		System.out.println("ok iphonex..");
		System.out.println("--------------------");

		System.out.println("Celulares da SAMSUNG");

		//uso do padrao singleton
		FabricanteCelular samsung = FabricanteCelularSingleton.getInstance("samsung");

		//uso do padrao fabrica
		Celular galaxy8 = samsung.constroiCelular("galaxy8");

		galaxy8.fazLigacao();
		galaxy8.tiraFoto();

		System.out.println("ok galaxy8");
		
		//uso do padrao fabrica
		Celular galaxy20 = samsung.constroiCelular("galaxy20");

		galaxy20.fazLigacao();
		galaxy20.tiraFoto();

		System.out.println("ok galaxy20");

	}
}
