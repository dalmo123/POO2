package questao2;

public class Main {

	public static void main(String[] args) {

		// utilização do padrao singleton (para nao criar instancias desnecessárias
		// quando podemos utilizar apenas uma
		// centralizando as criações de objetos).
		IVehicleMaker toyota = IVehicleMakerSingleton.getInstance("toyota");

		System.out.println("Veiculos TOYOTA..");

		// utilizacao do padrao fabrica (centralizando as criações de objetos).
		IVehicle corolla = toyota.makeVehicle("corolla");

		corolla.start();
		corolla.drive();
		corolla.stop();

		System.out.println("ok Corolla..");

		// utilizacao do padrao fabrica
		IVehicle hilux = toyota.makeVehicle("hilux");

		hilux.start();
		hilux.drive();
		hilux.stop();

		System.out.println("ok Hilux..");

		// utilizacao do padrao fabrica
		IVehicle etios = toyota.makeVehicle("etios");

		etios.start();
		etios.drive();
		etios.stop();

		System.out.println("ok Etios..");

		System.out.println("--------------------");
		// utilizacao do padrao singleton(para nao criar instancias desnecessárias
		// quando podemos utilizar apenas uma.
		IVehicleMaker honda = IVehicleMakerSingleton.getInstance("honda");

		System.out.println("Veiculos HONDA..");

		// utilizacao do padrao fabrica (centralizando as criações de objetos).
		IVehicle civic = honda.makeVehicle("civic");

		civic.start();
		civic.drive();
		civic.stop();

		System.out.println("ok Civic..");

		// utilizacao do padrao fabrica.
		IVehicle city = honda.makeVehicle("city");

		city.start();
		city.drive();
		city.stop();

		System.out.println("ok City..");

		// utilizacao do padrao fabrica.
		IVehicle fit = honda.makeVehicle("fit");

		fit.start();
		fit.drive();
		fit.stop();

		System.out.println("ok Fit..");

	}
}
