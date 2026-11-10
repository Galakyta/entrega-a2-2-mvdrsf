package questao3;

public class Cafe implements Bebidas{

      private static final double preco = 13.00; //literalmente o preco do ultra



    @Override
    public String getDescricao() {
        return "cafe terrivel do ultra: ";
    }

    @Override
    public double getPreco() {
        return preco;
    }

    
    }

