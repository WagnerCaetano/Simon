import javax.swing.*;
import javax.swing.BorderFactory;
import java.awt.event.*;
import java.sql.Time;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo {
	private Cor[] cores;
	private Botao[][] botoes;
	private Cor[] sorteado = new Cor[10];
	ArrayList<Cor> coreSorteadas;
	int dormir=400;

	Random gen = new Random();

	public Jogo(Cor[] simoncores,Botao[][] botoessimon){
		Contador.contador=0;
		this.cores = simoncores;
		this.botoes = botoessimon;
		coreSorteadas = new ArrayList<>();
	}
	public ArrayList<Cor> MostrarOrdem(){
		
		int x1=0 , y=0;
		for(int x =0 ; x <=Contador.contador;x++){
			sorteado[x] = cores[gen.nextInt(9)];
			if (x>=1)
				if (sorteado[x-1] != sorteado[x]){}
				else sorteado[x] = cores[gen.nextInt(9)];
			System.out.println(sorteado[x]);
			coreSorteadas.add(sorteado[x]);
		}

		for (int x = 0;x<=Contador.contador ;x++){
			for (x1 = 0 ; x1<botoes.length ; x1++){
				for (y =0 ; y<botoes.length;y++){
					if (botoes[x1][y].getCor().equals(sorteado[x])){
						try{
							
							new Thread().sleep(dormir+=100);
							botoes[x1][y].play();
						}
						catch(InterruptedException e){}
						blinking(botoes[x1][y]);
					}                    
				}
			}
		
		}

		aumentarTamanho();
		return coreSorteadas;
	}
	public void aumentarTamanho(){
		Contador.contador++;
	}
	public void blinking(Botao button){
		button.setOpaque(true);
		Timer blinkTimer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// blink the button background on and off
				
				button.setBorder(BorderFactory.createLineBorder(button.getColorb().brighter(),100));

			}
		});
		blinkTimer.setRepeats(false);
		blinkTimer.start();

		Timer unblinkTimer = new Timer(1200, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// blink the button background on and off
				button.setBorder(BorderFactory.createLineBorder(Color.white,10));
			}
		});
		unblinkTimer.setRepeats(false);
		unblinkTimer.start();
	}
}