package questao3;



public class Gelo extends ComplementoDeco {

    private static final double preco = 0.0; // espero que nn tenha problema deixar em zero mas eu n vou cobrar por gelo

    public Gelo(Bebidas bebida) {
        super(bebida, "Gelo por conta da casa, valor : ", preco);
    }
}