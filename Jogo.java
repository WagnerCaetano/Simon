import javax.swing.*;
import javax.swing.BorderFactory;
import java.awt.event.*;
import java.sql.Time;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Jogo {
    private Cor[] cores;
    private Botao[][] botoes;
    private Cor[] sorteado = new Cor[10];
    private int tamanho=0;
    Random gen = new Random();

    public Jogo(Cor[] simoncores,Botao[][] botoessimon){
        this.cores = simoncores;
        this.botoes = botoessimon;
    }
    public void MostrarOrdem(){
        int x1=0 , y=0;
        for(int x =0 ; x <=tamanho;x++){
        sorteado[x] = cores[gen.nextInt(9)];
        if (x>=1)
        if (sorteado[x-1] != sorteado[x]){}
        else sorteado[x] = cores[gen.nextInt(9)];
        System.out.println(sorteado[x]);}

        for (int x = 0;x<=tamanho ;x++){
            for (x1 = 0 ; x1<botoes.length ; x1++){
                for (y =0 ; y<botoes.length;y++){
                    if (botoes[x1][y].getCor().equals(sorteado[x])){
                        try{
                            new Thread().sleep(1000);
                            }
                        catch(InterruptedException e){}
                        blinking(botoes[x1][y]);
                    }                    
                }
            }
        }

        aumentarTamanho();
    }
    public void aumentarTamanho(){
        tamanho = gen.nextInt(4)+1;
    }
    public int getTamanho()
    {
        return tamanho;
    }
    public void blinking(Botao button){
        button.setOpaque(true);
        Timer blinkTimer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // blink the button background on and off
                button.setBorder(BorderFactory.createLineBorder(button.getColorb().brighter(),100));
            }
        });
        blinkTimer.setRepeats(false);
        blinkTimer.start();

        Timer unblinkTimer = new Timer(4000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // blink the button background on and off
                button.setBorder(BorderFactory.createLineBorder(Color.white,10));
            }
        });
        unblinkTimer.setRepeats(false);
        unblinkTimer.start();
    }
    public boolean Acertou(Cor[] b)
    {
        boolean b1=true;
        for (int x =0; x<=tamanho ;x++)
        {
            if (sorteado[x] != b[x])
            b1=false;
        }
        return b1;
    }
}