package questao3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {
		
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Carro("Vermelho", "Toyota", "Corolla"));
        veiculos.add(new Carro("Azul", "Honda", "Civic"));
        veiculos.add(new Onibus(50, 2020));
        veiculos.add(new Bicicleta("Verde"));
		
		
		VeiculoVisitor imprimirDados = new ImprimirDadosVisitor(); 
		VeiculoVisitor enviarMensagem = new EnviarNotificacaoVisitor();
		
		
		for (Veiculo veiculo : veiculos) {
            veiculo.accept(imprimirDados);
        }

		 for (Veiculo veiculo : veiculos) {
	            veiculo.accept(enviarMensagem);
	     }
		 
		
	}

}
