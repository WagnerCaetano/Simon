import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Botao extends JButton{

private Cor cores;
private static int tamanho = 9;

public Cor getCor()
{
    return this.cores;
}

public void setCor(Cor e)
{
    this.cores = e;
}

public Botao(Cor e)
{
    super();
    cores = e;
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

    switch(estado)
    {
        case Cor.AZUL: e.setColor(Color.BLUE); break;
        case Cor.VERMELHO: e.setColor(Color.RED); break;
        case Cor.AMARELO: e.setColor(Color.YELLOW); break;
        case Cor.LARANJA: e.setColor(Color.ORANGE); break;
        case Cor.VERDE: e.setColor(Color.GREEN); break;
        case Cor.CINZA: e.setColor(Color.GRAY); break;
        case Cor.ROXO: e.setColor(Color.PURPLE); break;
        case Cor.BRANCO: e.setColor(Color.WHITE); break;
        case Cor.PRETO: e.setColor(Color.BLACK); break;
    }
    e.fillRect(0, 0, tamanho, tamanho);
    }
}