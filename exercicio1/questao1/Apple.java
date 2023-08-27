package questao1;

public class Apple implements FabricanteCelular {

	@Override
	public Celular constroiCelular(String modelo) {
		
		if(modelo.equals("iphones")) {
			return new IphoneS();
		}
		else if(modelo.equals("iphonex")) {
			return new IphoneX();
		}
		return null;
	}

	
	
}
