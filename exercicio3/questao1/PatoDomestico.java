package exercicio3.questao1;

public class PatoDomestico implements Pato{


    @Override
    public void grasnar() {
        System.out.println("quack-quack");
    }

    @Override
    public void voar() {
        System.out.println("pato voando");
    }
    
}
