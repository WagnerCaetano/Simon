import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Regras extends JFrame {

	JTextArea regras;
	public Regras() {
		setSize(600,600);
		setLocationRelativeTo(null);
		setLayout(null);
		getContentPane().setBackground(Color.DARK_GRAY);
		regras = new JTextArea();
		regras.append("Simon (Genius) � um jogo eletr�nico de mem�ria com 4 \n "
				+ "grandes bot�es (Fizemos esse com 9 para deixar mais \n"
				+ "desafiador) que acendem e emitem sons em uma \n sequ�ncia aleat�ria que vai se tornando mais longa a cada \n "
				+ "rodada. \nO jogador deve repetir a sequ�ncia pressionando os bot�es \n na ordem correta. "
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "BOM JOGO!!!!");
		add(regras);
		regras.setBounds(0, 20, 600, 600);
		regras.setForeground(Color.white);
		regras.setBackground(Color.DARK_GRAY);
		regras.setEditable(false);
		regras.setFont(new Font("arial",Font.BOLD,20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
