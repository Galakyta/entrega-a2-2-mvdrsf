package questao2;

public class Mensalista implements Cobranca{
    private static final double valorMensalista = 100.00; //n lembro se era em caxa alta ou camel case constante socorro
    @Override 
    public double calcularCobranca(int minutos){
        return valorMensalista;
    }
}
