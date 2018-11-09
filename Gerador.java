import java.util.Random;
import java.util.ArrayList;

public class Gerador{
    private Cor b1 = Cor.EMPTY;
    private ArrayList<Cor> r = new ArrayList<>();
    private Random sortear = new Random();
    private int t ;
    
    public Gerador(int tamanho){ if(t>0) this.t = tamanho;}

    public ArrayList<Cor> getOrdem()
    {
        b1 = Cor.values()[sortear.nextInt(9)];
        for (int x = 1 ; x <= 9;x++){
        r.add(x,b1);}
        return r;
    }
    public void embaralhar(Botao[][] e)
    {
        b1 = Cor.values()[sortear.nextInt(9)];
        for(int x = 0 ; x <3;x++)
            for (int y = 0;y<3;y++)
            {
                e[x][y].setCor(b1);
            }
    }
}