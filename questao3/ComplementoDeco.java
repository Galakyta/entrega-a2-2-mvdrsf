package questao3;

public abstract class ComplementoDeco implements Bebidas {

    protected  Bebidas bebida;


    private  String nome;


    private double preco;

    protected ComplementoDeco(Bebidas bebida, String nome, double preco) {
        this.bebida = bebida;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getDescricao() {

        return "Descricao da bebida: " + bebida.getDescricao();
    }

    @Override
    public double getPreco() {

        
        return bebida.getPreco() + preco;
    }
}