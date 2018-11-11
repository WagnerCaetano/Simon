import javax.swing.*;


import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

class Botao extends JButton{
	private String nomeDoAudio;
	public String getNomeDoAudio() {
		return nomeDoAudio;
	}
	public void setNomeDoAudio(String nomeDoAudio) {
		this.nomeDoAudio = nomeDoAudio;
	}

	private Cor cores;
	private static int tamanho = 200;


	public Cor getCor()
	{
		return this.cores;
	}
	public Color getColorb()
	{
		return cores.getColor();

	}

	public void setCor(Cor e)
	{
		this.cores = e;
	}

	public Botao()
	{
		super();
		cores = Cor.PRETO;
	}

	public Dimension getMaximumSize()
	{
		return getPreferredSize();
	}

	public Dimension getMinimumSize()
	{
		return getPreferredSize();
	}

	public Dimension getPreferredSize()
	{
		return new Dimension(tamanho, tamanho);
	}

	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D e = (Graphics2D)g;

		e.setColor(cores.getColor(cores));
		e.fillRect(0, 0, tamanho, tamanho);
	}

	public void play() {
		URL url = getClass().getResource(nomeDoAudio+".wav");
		AudioClip audio = Applet.newAudioClip(url);
		audio.play();

	}

}
//musica btn
