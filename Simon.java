
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Simon extends JFrame implements ActionListener{
	
	private Botao[][] botao;//nome da matriz onde ficara os bot�es
	static ArrayList<Cor> colors = new  ArrayList<>();//criando um array list para guarda as cores sorteadas
	private Tabuleiro jogo;
	private int jogadas;
	//int igual[];
	//para que eu consiga sortear a cor terei q fazer uma 'copia' do enum para acessar 
	//sua posi��o e seu texto
	//private Cor cores[] = Cor.values();//copia todas as cores da clase 'Cor' para nas proximas vers�es poder-mos sortear os btn ou as cores.
	//igual = new int[9];//validacao para nao colocar cores iguais
	//int diferentes=0;//enche o vetor 
	//int ultimoValor;
	//intacia da classe Random para sortear as cores 
	//Random sortear = new Random();//para sortar numeros int para sortear cores para proximas vers�es

	
	
	public Simon() {
		
		getContentPane().setLayout(new GridLayout(3, 3));
		//fazendo um for para adicionar os btns no frame
		
		botao = new Botao[3][3];
		
		for (int i = 0; i < botao.length; i++) {
			for (int j = 0; j < botao.length; j++) {
				botao[i][j] = new Botao();
				add(botao[i][j]);
				botao[i][j].addActionListener(this);
			}
		}
		//colocando cores iniciais para os botoes
		botao[0][0].setCor(Cor.VERDE);
		botao[0][1].setCor(Cor.AZUL);
		botao[0][2].setCor(Cor.ROXO);
		
		botao[1][0].setCor(Cor.VERMELHO);
		botao[1][1].setCor(Cor.CINZA);
		botao[1][2].setCor(Cor.LARANJA);
		
		botao[2][0].setCor(Cor.PRETO);
		botao[2][1].setCor(Cor.BRANCO);
		botao[2][2].setCor(Cor.AMARELO);
		
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
		if (jogadas != jogo.getTamanho())
		jogadas++;
		else 
			if(jogo.Acertou(colors))
			{
				JOptionPane.showMessageDialog(null, "Você acertou a ordem!");
				jogo.reset();
			}
		
		 for (Cor clicados : colors) {//printa todas as cores ja foram apertadas
				System.out.println(clicados);
			}
		
		
		
	}
	
	public static void main(String[] args) {
		new Simon();
		
		
	}

}
