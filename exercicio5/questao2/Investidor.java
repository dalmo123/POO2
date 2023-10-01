package questao2;

public class Investidor implements Observer{

	  private String nome;
	    private double precoMinimo;
	    private double precoMaximo;

	    public Investidor(String nome, double precoMinimo, double precoMaximo) {
	        this.nome = nome;
	        this.precoMinimo = precoMinimo;
	        this.precoMaximo = precoMaximo;
	    }

	    @Override
	    public void update() {
	        System.out.println(nome + " foi notificado de uma mudanca no preco da acao.");
	    }

	    public void comprarAcao(Acao acao, double preco) {
	        if (preco <= precoMaximo) {
	            System.out.println(nome + " comprou acao " + acao.getNome() + " por " + preco);
	        }
	    }

	    public void venderAcao(Acao acao, double preco) {
	        if (preco >= precoMinimo) {
	            System.out.println(nome + " vendeu acao " + acao.getNome() + " por " + preco);
	        }
	    }
	}

