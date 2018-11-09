import javax.swing.JFrame;


import javafx.scene.layout.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Layout extends JFrame {
	
	public Layout() {
	super("SIMON");
	
	}
	JButton[] button;
	JLabel lblTitulo,img;
	
	//private Image image;
	//Icon img = new ImageIcon(getClass().getResource("simonimg.jpg"));
	//import of components for using
	
	public void Tela() {
		
		getContentPane().setLayout(null);
		setSize(400,400);
		setLocation(500, 500);
		
		//colocando background
		
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("C:\\programacao\\java\\Simon\\src\\simonimg.jpg")));
		setLayout(null);
		
		button = new JButton[3];
		for(int i=0;i<button.length;i++) {
			button[i] = new JButton();
		}
		lblTitulo = new JLabel("SIMON");
		lblTitulo.setBounds(100,20,200,40);
		lblTitulo.setFont(new Font("elasis", Font.BOLD, 30));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(225,225,225));
		getContentPane().add(lblTitulo);
		//configura e cria o primeiro btn
		button[0].setBounds(100, 113, 200, 40);
		button[0].setText("JOGAR");
		getContentPane().add(button[0]);
		
		//configura e cria o segundo btn
		button[1].setBounds(100,206, 200, 40);
		button[1].setText("INSTRU��ES");
		getContentPane().add(button[1]);
		
		//configura e cria o terceiro btn
		button[2].setBounds(100, 299, 200, 40);
		button[2].setText("DESENVOLVEDORES");
		getContentPane().add(button[2]);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		
		new Layout().Tela();
	}
}