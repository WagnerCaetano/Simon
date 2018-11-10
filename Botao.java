import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Botao extends JButton{

private Cor cores;
private static int tamanho = 100;


public Cor getCor()
{
    return this.cores;
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
    switch(cores)
    {
        case AZUL: e.setColor(Color.BLUE); break;
        case VERMELHO: e.setColor(Color.RED); break;
        case AMARELO: e.setColor(Color.YELLOW); break;
        case LARANJA: e.setColor(Color.ORANGE); break;
        case VERDE: e.setColor(Color.GREEN); break;
        case CINZA: e.setColor(Color.GRAY); break;
        case ROXO: e.setColor(Color.PINK); break;
        case BRANCO: e.setColor(Color.WHITE); break;
        case PRETO: e.setColor(Color.BLACK); break;
    }
    e.fillRect(0, 0, tamanho, tamanho);
    }
}