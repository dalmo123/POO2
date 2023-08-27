package questao1;

public class Samsung implements FabricanteCelular {

	@Override
	public Celular constroiCelular(String modelo) {

		if (modelo.equals("galaxy8"))
			return new Galaxy8();

		else if (modelo.equals("galaxy20"))
			return new Galaxy20();

		return null;
	}

}
