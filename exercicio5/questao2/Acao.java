package questao2;

import java.util.ArrayList;
import java.util.List;

public class Acao {
	
	private String nome;
	private double preco;
	private List<Investidor> investidores = new ArrayList<Investidor>();
	
	public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void adiciona(Investidor investidor) {
        investidores.add(investidor);
    }

    public void remove(Investidor investidor) {
        investidores.remove(investidor);
    }

    public double getPreco() {
        return preco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        notifyInvestidores();
    }

    private void notifyInvestidores() {
        for (Investidor investidor : investidores) {
            investidor.update();
        }
    }
}


