import javax.swing.*;
import javax.swing.BorderFactory;
import java.awt.event.*;
import java.sql.Time;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TimerTask;

public class Jogo {
	private Cor[] cores;
	private Botao[][] botoes;
	private Cor[] sorteado = new Cor[10];
	ArrayList<Cor> coreSorteadas;
	private int n=1;

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
						/*try{
							new Thread().sleep(1000);
						}
						catch(InterruptedException e){}
						blinking(botoes[x1][y]);*/
						int delay = 1000;   // delay de 5 seg.
						Timer timer = new Timer();
						
						timer.scheduleAtFixedRate(new TimerTask() {
								public void run() {
									blinking(botoes[x1][y]);
								}
							}, delay);
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
		/*button.setOpaque(true);
		Timer blinkTimer = new Timer(3000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// blink the button background on and off
				button.setBorder(BorderFactory.createLineBorder(button.getColorb().brighter(),100));
                SoundClick.BeatShowing();
			}
		});
		blinkTimer.setRepeats(false);
		blinkTimer.start();*/
		int delay = 3000;   // delay de 5 seg.
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
				public void run() {
					button.setBorder(BorderFactory.createLineBorder(button.getColorb().brighter(),100));
					SoundClick.BeatShowing();
				}
			}, delay);
		

		/*Timer unblinkTimer = new Timer(4000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// blink the button background on and off
				button.setBorder(BorderFactory.createLineBorder(Color.white,10));
			}
		});
		unblinkTimer.setRepeats(false);
		unblinkTimer.start();*/
		int delay2 = 4000;   // delay de 5 seg.
		Timer timer2 = new Timer();
		
		timer2.scheduleAtFixedRate(new TimerTask() {
				public void run() {
					button.setBorder(BorderFactory.createLineBorder(Color.white,10));
				}
			}, delay);
	}
}