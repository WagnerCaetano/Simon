import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Desenvolvedores extends JFrame {
	JTextArea nomes;
	JLabel projeto;
	JLabel escola;
	JLabel entrega;
	public Desenvolvedores() {
		setSize(600,600);
		setLocationRelativeTo(null);
		setLayout(null);
		getContentPane().setBackground(Color.darkGray);
		
		//colocando itens
		
		projeto = new JLabel("SIMON",JLabel.CENTER);
		add(projeto);
		projeto.setBounds(0,20,600,50);
		projeto.setForeground(Color.red);
		projeto.setFont( new Font( "arial", Font.BOLD, 25 )) ;
		String devs = "Guilherme Henrique Trevisan, RA: 18320" +"\n"+
					  "Lucas Campos da Silva,           RA: 18321"+"\n"+
				       "Wagner Caetano,                       RA: 18300";
		nomes = new JTextArea();
		nomes.append(devs);
		nomes.setBackground(Color.darkGray);
		nomes.setFont( new Font( "arial", Font.BOLD, 25 )) ;
	//	nomes.setText( "Lucas Campos da Silva, RA: 18321"); 
			//nomes.setText("Wagner Caetano, RA: 18300");
		
		add(nomes);
		nomes.setForeground(Color.WHITE);
		nomes.setBounds(50,200,600,200);
		nomes.setEditable(false);
		
		entrega = new JLabel("Entrega: 12/11/2018 - Métodos Ágeis");
		add(entrega);
		entrega.setFont(new Font("arial",Font.BOLD,15));
		entrega.setForeground(Color.red);
		entrega.setBounds(0,400,600,50);
		
		escola = new JLabel("Colégio Técnico de Campinas",JLabel.CENTER);
		add(escola);
		escola.setFont(new Font("arial",Font.BOLD,20));
		escola.setForeground(Color.red);
		escola.setBounds(0,500,600,50);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
