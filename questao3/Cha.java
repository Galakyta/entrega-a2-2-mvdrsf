package questao3;

public class Cha implements Bebidas {


    //eu ia fazer bubble tea mas cara tao mt morto e sem ideia
    
    private static final double preco = 19.00;



    @Override
    public String getDescricao() {
        return "bubble tea da bubblekill: ";
    }

    @Override
    public double getPreco() {
        return preco;
    }
}