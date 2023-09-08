package exercicio3.questao2;

public class CalculoDecimal implements CalculadoraDecimal {

    @Override
    public int somar(int a, int b) {
       return a + b;
    }

    @Override
    public int subtrair(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
}
