package questao2;

public class MercadoFinanceiro {
	
	 public static void main(String[] args) {
	        Acao acao = new Acao("Empresa XYZ", 100.0);
	        Investidor investidor1 = new Investidor("Investidor1", 90.0, 110.0);
	        Investidor investidor2 = new Investidor("Investidor2", 95.0, 105.0);

	        acao.adiciona(investidor1);
	        acao.adiciona(investidor2);

	        // Simulando uma mudança no preço da ação
	        acao.setPreco(106.0);
	    }
}
