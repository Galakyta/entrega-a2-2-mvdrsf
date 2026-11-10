package questao2;

public class Main {

    public static void main(String[] args) {
        
    
        Cobranca mensalista = new  Mensalista();
        Cobranca rotativo = new Rotativo();
        Cobranca conveniado = new Conveniado(); 

        Tiquete tiquete1 = new Tiquete("bcz-123", 301, new Rotativo()); //carro do meu pai pena q nn ta pra colocar ford ka besourinho



        //eu ja botei ele como rotativo mas vou trocar e destrocar pra ficar mais claro 

        tiquete1.resumoDoTiquete();

        tiquete1.setModalidade(conveniado);

        tiquete1.resumoDoTiquete();

        tiquete1.setModalidade(mensalista);

        tiquete1.resumoDoTiquete();

        tiquete1.setModalidade(rotativo);

        tiquete1.resumoDoTiquete();
        
    }
    
}
