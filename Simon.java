
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Simon extends JFrame implements ActionListener{
	
	private Botao[][] botao;//nome da matriz onde ficara os bot�es
	ArrayList<Cor> colors = new  ArrayList<Cor>();//criando um array list para guarda as cores sorteadas
	private Cor[] cor;
	private int contador=0;
	Jogo game;
	ArrayList<Integer> numeros = new ArrayList<Integer>();//crio um array para guardar as cores embaralhadas
	
	
	public Simon() {
		super("SIMON 1.6");
		for (int i = 0; i < 9; i++) {//colocando dados no array para pode sortiar sem repitir
			numeros.add(i);
		}
		getContentPane().setLayout(new GridLayout(3, 3));
		//fazendo um for para adicionar os btns no frame
		
		
		botao = new Botao[3][3];
		cor = Cor.values();
		Collections.shuffle(numeros);//embaralha numeros
		
		for (int i = 0; i < botao.length; i++) {
			for (int j = 0; j < botao.length; j++) {
				botao[i][j] = new Botao();
				botao[i][j].setCor(cor[numeros.get(contador)]);		
				add(botao[i][j]);
				botao[i][j].addActionListener(this);
				botao[i][j].setBorder(BorderFactory.createLineBorder(Color.white,10));
				botao[i][j].setBorderPainted(true);
				contador++;
			}
			
		}
		game=new Jogo(cor,botao);
		game.MostrarOrdem();
		/*botao[2][0].setCor(Cor.PRETO);
		botao[2][1].setCor(Cor.BRANCO);
		botao[2][2].setCor(Cor.AMARELO);*/
		
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent btn) {//btn � o botao que foi apertado no momento
		//Botao apertado = (Botao) btn.getSource();//faz o action virar um botao
		
		//colors.add(apertado.getCor());
		game.MostrarOrdem();

	/*	if (jogadas != jogo.getTamanho())
		jogadas++;
		else {
			if(jogo.Acertou(colors))
			{
				JOptionPane.showMessageDialog(null, "Você acertou a ordem!");
				jogo.reset();
			}
		/*
		 for (Cor clicados : colors) {//printa todas as cores ja foram apertadas
				System.out.println(clicados);
		 }*/
		}
	public static void main(String[] args) {
		new Simon();
		
		
	}

}
