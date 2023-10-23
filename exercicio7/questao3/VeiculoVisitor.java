package questao3;

public interface VeiculoVisitor {

	void visit(Carro carro);
	void visit(Onibus onibus );
	void visit(Bicicleta bicicleta);

}
