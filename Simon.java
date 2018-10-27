
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class Simon extends JFrame implements ActionListener{
	
	private Botao[][] botoes;//nome da matriz onde ficara os botões
	ArrayList<Cor> colors = new  ArrayList<>();//criando um array list para guarda as cores sorteadas
	int igual[];
	//para que eu consiga sortear a cor terei q fazer uma 'copia' do enum para acessar 
	//sua posição e seu texto
	private Cor cores[] = Cor.values();
	
	//intacia da classe Random para sortear as cores 
	Random sortear = new Random();

	
	
	public Simon() {
		igual = new int[9];//validacao para nao colocar cores iguais
		int diferentes=0;//enche o vetor 
		int ultimoValor;
		getContentPane().setLayout(new GridLayout(3, 3));
		//fazendo um for para adicionar os btns no frame
		
		botoes = new Botao[3][3];
		
		for (int i = 0; i < botoes.length; i++) {
			for (int j = 0; j < botoes.length; j++) {
				botoes[i][j] = new Botao();
				ultimoValor = sortear.nextInt(9);
				for (int j2 = 0; j2 <= igual.length; j2++) {
					if(ultimoValor == j2) {
						
					}
				}
			//	botoes[i][j].setCor(cores);
				add(botoes[i][j]);
				botoes[i][j].addActionListener(this);
			}
		}
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent btn) {//btn é o botao que foi apertado no momento
		
		
	}
	
	public static void main(String[] args) {
		new Simon();
		 
	}

}
