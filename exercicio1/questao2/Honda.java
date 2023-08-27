package questao2;

public class Honda implements IVehicleMaker {

	
	//utilizando uma fabrica para parametrizar as chamadas de new, 
	//visando melhorar e facilitar caso queiramos expandir nosso codigo
    @Override
    public IVehicle makeVehicle(String modelo) {

        if (modelo.equals("civic"))
            return new Civic();

        if (modelo.equals("city"))
            return new City();

        else if (modelo.equals("fit"))
            return new Fit();

        return null;
    }
}
