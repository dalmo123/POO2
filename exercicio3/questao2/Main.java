package exercicio3.questao2;

public class Main {

    public static void main(String[] args) {
        
        CalculadoraDecimal cd = new CalculoDecimal();
        CalculadoraBinaria cb = new CalculoBinario(cd);

        Calculadora calculadora = new CalculadoraAdaptor(cd, cb);

        String somaBinario = calculadora.somar("1011", "101");
        System.out.println("Soma em binario: " +  somaBinario);
        
        String subtracaoBinario = calculadora.subtrair("1011", "101");
        System.out.println("Subtracao em binario: " + subtracaoBinario);
        
        int somaInt =  calculadora.somar(10, 10);
        System.out.println("Soma decimal: " + somaInt);
        
        int subtracaoInt = calculadora.subtrair(20, 10);
        System.out.println("Subtracao decimal: " + subtracaoInt );
        
        int multiInt = calculadora.multiplicar(10, 10);
        System.out.println("Multiplicacao de decimal: " + multiInt);
       
       

    }
    
}
