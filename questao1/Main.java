package questao1;

public class Main {

    public static void main(String[] args) {
        Observer vendas = new Vendas();
        Observer compras = new Compras();
        Observer auditoria = new Auditoria();

        
        Produto geladeira = new Produto("Geladeira",10);
        
        geladeira.inscrever(compras);
        geladeira.inscrever(vendas);
        geladeira.inscrever(auditoria);


        geladeira.setEstoque(10);
        geladeira.setEstoque(10);

        //ok em primeiro lugar nao puxou o auditoria entao ta funcionando quando na altero nada AAAAAAAAAA q inferno

        geladeira.desinscrever(auditoria);

        //ta foi foi

        geladeira.inscrever(auditoria);


        geladeira.setEstoque(2);
        geladeira.setEstoque(2);

        // ta ja ta indo aenas quando eu realmente mudo ta otimo

        geladeira.setEstoque(0);
        geladeira.setEstoque(2);

        //ok ta indo quando volta e so quando volta


    }

}
