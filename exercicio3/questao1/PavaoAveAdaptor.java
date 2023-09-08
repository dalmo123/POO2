package exercicio3.questao1;

public class PavaoAveAdaptor implements Ave{
    
    Pavao pavao;


    public PavaoAveAdaptor(Pavao pavao){
        this.pavao = pavao;
    }


    @Override
    public void emitirSom() {
        pavao.cantar();
        
    }

    @Override
    public void voar() {
       System.out.println("pavao nao voa");
               
    }
}
