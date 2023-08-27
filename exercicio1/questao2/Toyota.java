package questao2;

public class Toyota implements IVehicleMaker {
    
	
	
	//utilizando uma fabrica para parametrizar as chamadas de new, 
	//visando melhorar e facilitar caso queiramos expandir nosso codigo
	//comparamos uma String recebida e se ela for equals algum modelo valido
	//é criado uma nova instancia daquele modelo.
	@Override
    public IVehicle makeVehicle(String modelo){
        if(modelo.equalsIgnoreCase("corolla")){
            return new Corolla();
        }
        if(modelo.equals("hilux")){
            return new Hilux();
        }
        else if(modelo.equals("etios")){
            return new Etios();
        }
        return null;
    }
}
