package exercicio3.questao1;

public class Main {
    
 
    public static void main(String ... args) {
        
        Pato pato = new PatoDomestico();
        Ave patoAve = new PatoAveAdapator(pato);

        Pavao pavao = new PavaoAzul();
        Ave pavaoAve = new PavaoAveAdaptor(pavao);

        Main main = new Main();

        main.habilidadesDaAve(patoAve);
        main.habilidadesDaAve(pavaoAve);

    }

    public void habilidadesDaAve(Ave ave){
        ave.emitirSom();
        ave.voar();
    }

}
