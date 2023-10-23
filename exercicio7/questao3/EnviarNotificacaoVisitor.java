package questao3;

public class EnviarNotificacaoVisitor implements VeiculoVisitor {

	@Override
	public void visit(Carro carro) {
		System.out.println("Enviando mensagem para o dono do Carro: 'Favor atualizar dados do IPVA'");
	}

	@Override
	public void visit(Onibus onibus) {
		System.out.println("Enviando mensagem para o dono do Onibus: 'Atencao para atualizacao das licencas'");
	}

	@Override
	public void visit(Bicicleta bicicleta) {
		 System.out.println("Enviando mensagem para o dono da Bicicleta: 'Comemore no parque o dia do ciclismo'");
	}

}
