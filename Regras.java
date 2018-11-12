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
		regras.append("Simon (Genius) é um jogo eletrônico de memória com 4 \n "
				+ "grandes botões (Fizemos esse com 9 para deixar mais \n"
				+ "desafiador) que acendem e emitem sons em uma \n sequência aleatória que vai se tornando mais longa a cada \n "
				+ "rodada. \nO jogador deve repetir a sequência pressionando os botões \n na ordem correta. "
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
