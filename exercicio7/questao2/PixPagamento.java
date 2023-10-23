package questao2;

public class PixPagamento implements PagamentoStrategy{

	 @Override
	    public void pagar(double total) {
	        System.out.println("Pagamento via pix\nTotal R$: " + total);
	    }
}
