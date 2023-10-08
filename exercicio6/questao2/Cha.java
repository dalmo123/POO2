
public class Cha extends PreparadorBebida {
	
	protected void prepararBebidaBase() {
        System.out.println("Fazendo cha");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando limao e mel");
    }
}
