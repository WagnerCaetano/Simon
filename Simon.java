
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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;




public class Simon extends JFrame implements ActionListener{
	
	private Botao[][] botao;//nome da matriz onde ficara os botï¿½es
	ArrayList<Cor> colors = new  ArrayList<Cor>();//criando um array list para guarda as cores sorteadas
	private Cor[] cor;
	private int contador=0;	
	Jogo game;
	ArrayList<Integer> numeros = new ArrayList<Integer>();//crio um array para guardar as cores embaralhadas
	ArrayList<Cor> coresSorteadas;
	int totalJogadas = 1;
	public Simon() {
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
		coresSorteadas = new ArrayList<Cor>();
		coresSorteadas = game.MostrarOrdem();
		
		
		setSize(420,420);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}
		
	
	
	@Override
	public void actionPerformed(ActionEvent btn) {//btn ï¿½ o botao que foi apertado no momento
		Botao apertado = (Botao) btn.getSource();//faz o action virar um botao
		colors.add(apertado.getCor());
		SoundClick.Beat();
		
		if(coresSorteadas.size() <= totalJogadas) {
			if(coresSorteadas.equals(colors)) {
				System.out.println("Acertei");
				colors.clear();
				coresSorteadas.clear();
				totalJogadas=0;
				coresSorteadas = game.MostrarOrdem();
				
			}			
			else {
				JOptionPane.showMessageDialog(null,"Potuação: "+totalJogadas);
				JOptionPane.showMessageDialog(null,"GAME OVER");
				setVisible(false);
				new Layout().setVisible(true);;
			}
		}
		totalJogadas++;
	
		
		
		
	}	


}
