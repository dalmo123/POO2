package exercicio3.questao2;

public class CalculoBinario implements CalculadoraBinaria {

    CalculadoraDecimal cd;
    
    public CalculoBinario(CalculadoraDecimal cd) {
    	this.cd = cd;
    }

    @Override
    public String somar(String a, String b) {
        
        int decimalA = Integer.parseInt(a, 2);
        int decimalB = Integer.parseInt(b, 2);

        int soma = cd.somar(decimalA, decimalB);

        String resultado =  Long.toBinaryString(soma);

        return resultado;

    }

    @Override
    public String subtrair(String a, String b) {
        int decimalA = Integer.parseInt(a, 2);
        int decimalB = Integer.parseInt(b, 2);

        int soma = cd.subtrair(decimalA, decimalB);

        String resultado =  Long.toBinaryString(soma);

        return resultado;
    }
    
}
