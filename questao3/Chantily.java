package questao3;

public class Chantily extends ComplementoDeco {

    private static final double preco = 12.67;

    public Chantily(Bebidas bebida) {
        super(bebida, "Chantily (aqueles que vem em lata spray bem ruim), valor: ", preco);
    }
}
