package exercicio3.questao2;

public class CalculadoraAdaptor implements Calculadora {


    CalculadoraBinaria calculadoraBinaria;
    CalculadoraDecimal calculadoraDecimal;


    public CalculadoraAdaptor(CalculadoraDecimal calculadoraDecimal, CalculadoraBinaria calculadoraBinaria){
        this.calculadoraDecimal = calculadoraDecimal;
        this.calculadoraBinaria = calculadoraBinaria;
    }



    @Override
    public String somar(String a, String b) {
       return calculadoraBinaria.somar(a, b);
    }

    @Override
    public String subtrair(String a, String b) {
       return calculadoraBinaria.subtrair(a, b);
    }

    @Override
    public int somar(int a, int b) {
       return calculadoraDecimal.somar(a, b);
    }

    @Override
    public int subtrair(int a, int b) {
       return calculadoraDecimal.subtrair(a, b);
    }

    @Override
    public int multiplicar(int a, int b) {
       return calculadoraDecimal.multiplicar(a, b);
    }


    

}
