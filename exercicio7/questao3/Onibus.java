package questao3;

public class Onibus extends Veiculo {
	
	private int lugares;
    private int anoFabricacao;

    public Onibus(int lugares, int anoFabricacao) {
        this.lugares = lugares;
        this.anoFabricacao = anoFabricacao;
    }

    public int getLugares() {
        return lugares;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    void accept(VeiculoVisitor visitor) {
        visitor.visit(this);
    }
}
