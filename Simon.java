
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Simon extends JFrame implements ActionListener{
	
	private Botao[][] botao;//nome da matriz onde ficara os bot�es
	 ArrayList<Cor> colors = new  ArrayList<Cor>();//criando um array list para guarda as cores sorteadas
	//private Tabuleiro jogo;
	private int jogadas;
	private Cor[] cor;
	private int contador=0;
	
	//para que eu consiga sortear a cor terei q fazer uma 'copia' do enum para acessar 
	//sua posi��o e seu texto
	
	
	
	
	//intacia da classe Random para sortear as cores 
	
	ArrayList<Integer> numeros = new ArrayList<Integer>();//crio um array para guardar as cores embaralhadas
	
	
	public Simon() {
		for (int i = 0; i < 10; i++) {//colocando dados no array para pode sortiar sem repitir
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
				contador++;
			}
			
		}
		
		botao[2][0].setCor(Cor.PRETO);
		botao[2][1].setCor(Cor.BRANCO);
		botao[2][2].setCor(Cor.AMARELO);
		jogo = new Tabuleiro(botao);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent btn) {//btn � o botao que foi apertado no momento
		Botao apertado = (Botao) btn.getSource();//faz o action virar um botao
		//System.out.println(apertado.getCor());
		
		//adicionando cores ao array list
		
		colors.add(apertado.getCor());
	/*	if (jogadas != jogo.getTamanho())
		jogadas++;
		else {
			if(jogo.Acertou(colors))
			{
				JOptionPane.showMessageDialog(null, "Você acertou a ordem!");
				jogo.reset();
			}
		*/
		 for (Cor clicados : colors) {//printa todas as cores ja foram apertadas
				System.out.println(clicados);
			}
		
		
		
	}
	
	public static void main(String[] args) {
		new Simon();
		
		
	}

}
