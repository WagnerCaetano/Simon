import javax.swing.*;
import javax.swing.BorderFactory;
import java.awt.event.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Jogo {
    private Cor[] cores;
    private Botao[][] botoes;
    private Cor[] sorteado = new Cor[100];
    private int tamanho=1;

    public Jogo(Cor[] simoncores,Botao[][] botoessimon){
        this.cores = simoncores;
        this.botoes = botoessimon;
    }
    public void MostrarOrdem(){
        /*System.out.println(botoes.length+"");
        int x1 , y;
        Random gen = new Random();
        for(int x =0 ; x <tamanho;x++){
        sorteado[x] = cores[gen.nextInt(10)];
        for( x1 = 0 , y =0 ; x1<botoes.length && y <botoes.length ;x++,y++){
        if(botoes[x1][y].getCor() == sorteado[x])
        break;
        }
        blinking(botoes[x1][y]);
        botoes[x1][y].repaint();
    }
        aumentarTamanho();*/
        blinking(botoes[0][0]);
        botoes[0][0].setBorder(BorderFactory.createLineBorder(Color.WHITE));

    }
    public void aumentarTamanho(){
        tamanho+=tamanho;
    }
    public void blinking(Botao button){
        button.setOpaque(true);
        Timer blinkTimer = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // blink the button background on and off
                button.setBorder(BorderFactory.createLineBorder(Color.red,5));
            }
        });
        blinkTimer.setRepeats(false);
        blinkTimer.start();

        Timer unblinkTimer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // blink the button background on and off
                button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            }
        });
        unblinkTimer.setRepeats(false);
        unblinkTimer.start();
        
    }
}