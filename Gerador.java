import java.util.Random;
import java.util.ArrayList;

public class Gerador{
    private Cor b = new Cor(Cor.EMPTY);
    private ArrayList<Cor> r = new ArrayList<>();
    private Random sortear = new Random();
    private int t ;
    
    public Gerador(int tamanho){ if(t>0) this.t = tamanho;}

    public ArrayList getOrdem()
    {
        for (int x = 0 ; x <= 9;x++){
        r.set(x, b(sortear.nextInt(9)));}
        return r;
    }
}