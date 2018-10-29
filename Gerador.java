import java.util.Random;
import java.util.ArrayList;

public class Gerador{
    private Cor b = Cor.EMPTY;
    private ArrayList<Cor> r = new ArrayList<>();
    private Random sortear = new Random();
    private int t ;
    
    public Gerador(int tamanho){ if(t>0) this.t = tamanho;}

    public ArrayList getOrdem()
    {
        b = Cor.values[sortear.nextInt(9)];
        for (int x = 0 ; x <= 9;x++){
        r.set(x,b);}
        return r;
    }
}