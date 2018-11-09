import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Jogo {
    private Cor[] cores;
    private Botao[][] botoes;
    private ArrayList<Cor> colors = new  ArrayList<Cor>();
    private int tamanho=1;

    public Jogo(Cor[] simoncores,Botao[][] botoessimon){
        cores = simoncores;
        botoes = botoessimon;
    }
    public void MostrarOrdem(){
        Random gen = new Random();
        for(int x =0 ; x <tamanho;x++){
        colors.add(cores[gen.nextInt(10)]);
        for(int x1 = 0 , y =0 ; x1<3 && y <3 ;x++,y++)
        if(botoes[x1][y].getCor() == colors.get(x))
        blinking(botoes[x1][y]);}
        aumentarTamanho();

    }
    public void aumentarTamanho(){
        tamanho+=tamanho;
    }
    private void blinking(Botao botao){
        botao.Piscar();
        try{
        Thread.sleep(7000); 
        }
        catch (InterruptedException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        botao.repaint();
    }
}