package questao3;

public class Calda extends ComplementoDeco{

    private static final double preco = 9.90; //padrao ultra la em cima

    
    public Calda(Bebidas bebida) {
        super(bebida, "calda de chocolate, valor: ", preco);
    }
}