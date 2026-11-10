package questao3;

public class Main {

    public static void main(String[] args) {
        Bebidas pedido1 = new Chantily(new Cha());

        Bebidas pedido2 = new Leite(new Leite(new Cha()));


        Bebidas pedido3 = new Cafe();

        Bebidas pedido4 = new Calda(new Cafe());

        resumirPedido(pedido1);


        //ok foi de buenas
        resumirPedido(pedido2);

        //nossa fico horrivel com 2 pontinho vo colocar 2 barrinha

        resumirPedido(pedido3);


        //ehhhhhhhhhhhrrrmmmm maisssso u menos a cara to cansado vai assim
        resumirPedido(pedido4);
    }

    private static void resumirPedido(Bebidas pedido) {

        System.out.println("resumo do pedido // " + pedido.getDescricao() + "  " + pedido.getPreco());


    }
}