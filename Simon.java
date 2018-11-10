
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Simon extends JFrame implements ActionListener{
	
	private Botao[][] botao;//nome da matriz onde ficara os bot�es
	private Cor[] colors = new Cor[10];//criando um array list para guarda as cores sorteadas
	private Cor[] cor;
	private int contador=0;
	private Jogo game;
	private ArrayList<Integer> numeros = new ArrayList<Integer>();//crio um array para guardar as cores embaralhadas
	private int pontos;
	private JLabel lblpontos = new JLabel();
	private int X =0;
	
	public Simon() {
		super("SIMON 1.6");
		for (int i = 0; i < 9; i++) {//colocando dados no array para pode sortiar sem repitir
			numeros.add(i);
		}
		getContentPane().setLayout(new GridLayout(4, 3));
		//fazendo um for para adicionar os btns no frame
		lblpontos.setFont(new Font("Serif", Font.BOLD, 12));
		lblpontos.setText("Pontos: " + pontos);
		
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
		add(lblpontos);
		game=new Jogo(cor,botao);
		game.MostrarOrdem();
		
		
		setSize(600,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent btn) {
		
		Botao botao1 = (Botao) btn.getSource();
			if (colors.length <=game.getTamanho())
			{
				colors[X] = botao1.getCor();
				X++;
			}
			else{
				if (game.Acertou(colors)){
						pontos++;
						game.MostrarOrdem();
				}
					else pontos =0 ;
					lblpontos.setText("Pontos: " + pontos+"tste");
				}

	}
	public static void main(String[] args) {
		new Simon();
		
		
	}

}
