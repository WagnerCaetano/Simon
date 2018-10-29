import java.util.ArrayList;
import java.util.Random;

public class Tabuleiro{
    private Gerador gen;
    private ArrayList<Cor> aux;
    private int tamanho=2;
    private Random r2 = new Random();
    private Botao[][] tela;

    public Tabuleiro(Botao[][] b)
    {
        tela = b;
        gen = new Gerador(tamanho);
        gerarOrdem();
    }
    public int getTamanho(){return tamanho;}
    public void gerarOrdem()
    {
        aux = gen.getOrdem();
    }
    /*public void mostraOrdem(){
        for(int o = 0; o<tamanho;o++)
        for(int x = 0;x<3;x++)
        for(int y = 0; y<3;y++)
        if (tela[x][y].getCor() == aux.get((index)).getCor())
        tela[x][y].setCor(e);
    }*/
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
        if (r2.nextFloat() <= 0.3)
            gen.embaralhar(tela);

    }

}