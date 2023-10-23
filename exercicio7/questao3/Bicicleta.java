package questao3;

public class Bicicleta extends Veiculo {
	
	private String cor;

    public Bicicleta(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

	
	@Override
	void accept(VeiculoVisitor visitor) {
		visitor.visit(this);
	}

}
