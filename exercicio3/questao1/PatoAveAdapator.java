package exercicio3.questao1;

public class PatoAveAdapator implements Ave{
    

    Pato pato;

    public PatoAveAdapator(Pato pato){
        this.pato = pato;
    }


    @Override
    public void emitirSom() {
        pato.grasnar();
    }

    @Override
    public void voar() {
        pato.voar();
    }
}
