import java.util.ArrayList;

public class Tabuleiro{
    private Gerador gen;
    private ArrayList<Cor> aux;
    private int tamanho=2;

    public Tabuleiro()
    {
        gen = new Gerador(tamanho);
        gerarOrdem();
    }
    public int getTamanho(){return tamanho;}
    public void gerarOrdem()
    {
        aux = gen.getOrdem();
    }
    public boolean Acertou(ArrayList<Cor> cores)
    {
        boolean acertou = true;
        for(int x =0; x<= tamanho ; x++)
        if(aux.get(x) != cores.get(x)) acertou = false;
        return acertou;
    }
    public void reset(){
        gerarOrdem();
        tamanho +=tamanho;
    }

}