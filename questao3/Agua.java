package questao3;



public class Agua extends ComplementoDeco {

    private static final double preco = 0.0; // espero que nn tenha problema deixar em zero mas eu n vou cobrar por Agua

    public Agua(Bebidas bebida) {
        super(bebida, "Agua por conta da casa, valor : ", preco);
    }
}