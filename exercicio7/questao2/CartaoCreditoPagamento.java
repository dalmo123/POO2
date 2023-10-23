package questao2;

public class CartaoCreditoPagamento implements PagamentoStrategy {

	 @Override
	    public void pagar(double total) {
	        System.out.println("Pagamento via cartao de credito\nTotal R$: " + total);
	    }
}
