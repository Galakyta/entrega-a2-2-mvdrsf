package questao3;

public class Main {

    public static void main(String[] args) {
        Bebidas pedido1 = new Chantily(new Gelo());

        Bebidas pedido2 = new Leite(new Leite(new Espresso()));
        Bebidas pedido3 = new Calda(new Chantilly(new Leite(new Cha())));

        exibir(pedido1);
        exibir(pedido2);
        exibir(pedido3);
    }

    private static void exibir(Bebida pedido) {
        System.out.printf("%-45s R$ %.2f%n", pedido.getDescricao(), pedido.getPreco());
    }
}