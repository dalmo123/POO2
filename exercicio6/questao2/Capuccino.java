
public class Capuccino extends PreparadorBebida {
	
	protected void prepararBebidaBase() {
        System.out.println("Fazendo cafe e leite");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando espuma de leite e chocolate em po");
    }
}
