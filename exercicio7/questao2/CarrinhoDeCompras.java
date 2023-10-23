package questao2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	 private List<Item> items = new ArrayList<Item>();
	 private PagamentoStrategy estrategiaPagamento;
	 private FreteStrategy estrategiaFrete;
	 
	    public void adicionaItem(Item item){
	        items.add(item);
	        
	    }
	    public void removeItem(Item item){
	        items.remove(item);
	    }
	    
	    public int calculaTotal(){
	        int sum = 0;
		for(Item item : items){
	            sum += item.getPreco();
	        }
		return sum;
	    }

	    
	    public void setEstrategiaFrete(FreteStrategy estrategiaFrete) {
	        this.estrategiaFrete = estrategiaFrete;
	    }
	    
	    public void setEstrategiaPagamento(PagamentoStrategy estrategiaPagamento) {
	        this.estrategiaPagamento = estrategiaPagamento;
	    }

	    
	    public double calculaFrete() {
	        if (estrategiaFrete != null) {
	            return estrategiaFrete.calcularFrete();
	        }
	        return 0.0; // Estratégia de frete não definida
	    }
	    
	    public void realizaPagamento() {
	        double total = calculaTotal() + calculaFrete();
	        estrategiaPagamento.pagar(total);
	    }

}
