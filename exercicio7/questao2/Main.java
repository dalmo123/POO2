package questao2;

public class Main {

	public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adiciona itens ao carrinho
        carrinho.adicionaItem(new Item("Produto 1", 100.0));
        carrinho.adicionaItem(new Item("Produto 2", 50.0));

        // Define a estratégia de pagamento
        carrinho.setEstrategiaPagamento(new PixPagamento());

        // Define a estratégia de frete (Sedex ou Normal)
        carrinho.setEstrategiaFrete(new SedexFrete());

        // Realiza o pagamento
        carrinho.realizaPagamento();
    }
}
