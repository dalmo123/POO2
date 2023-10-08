
public abstract class PreparadorBebida {

	public final void prepararBebida() {
        aquecerAgua();
        prepararBebidaBase();
        colocarNaXicara();
        adicionarCondimentos();
    }

    // Metodos abstratos que serão implementados pelas subclasses
    protected abstract void prepararBebidaBase();
    protected abstract void adicionarCondimentos();

    // Metodos comuns a todas as bebidas
    private void aquecerAgua() {
        System.out.println("Aquecendo a agua");
    }

    private void colocarNaXicara() {
        System.out.println("Colocando na xicara");
    }
}
