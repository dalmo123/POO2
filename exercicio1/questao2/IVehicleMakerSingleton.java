package questao2;

public class IVehicleMakerSingleton {

    private static IVehicleMaker toyota;
    private static IVehicleMaker honda;

    
    //usamos o padrao Singleton para criar uma unica instancia e nao ficar criando instancias desnecessarias
    //portanto, o codigo faz uma validação para ver se ja existe alguma instancia, caso já tenha sido criado
    //ele retorna a instancia que ja existia, se nao, ele cria uma nova instancia..
    public static IVehicleMaker getInstance(String tipo) {

        if (tipo.equals("toyota")) {
            if (toyota == null)
                toyota = new Toyota();
            return toyota;
        } else {
            if (honda == null)
                honda = new Honda();
            return honda;
        }

    }
}
