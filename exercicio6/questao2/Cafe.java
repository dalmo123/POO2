

public class Cafe extends PreparadorBebida {
	@Override
    protected void prepararBebidaBase() {
        System.out.println("Fazendo cafe");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando acucar e mexendo");
    }
}
