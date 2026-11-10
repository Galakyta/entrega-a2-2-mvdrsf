package questao1;

public interface Subject {
    public void inscrever(Observer observer);
    public void desinscrever(Observer observer);


    //pingar observer nunca vem com nada por construtor 
    public void pingarObservers();
}
//subject mesma coisa, so copiar e colar pq ele so vai delimitar como os observer