import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Botao extends JButton{

private Estado estado;
private static int tamanho = 9;

public Estado getEstado()
{
    return this.estado;
}

public void setEstado(Estado e)
{
    this.estado = e;
}

public Botao(Estado e)
{
    super();
    estado = e;
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
        case Estado.AZUL: e.setColor(Color.BLUE) break;
        case Estado.VERMELHO: e.setColor(Color.RED) break;
        case Estado.AMARELO: e.setColor(Color.YELLOW) break;
        case Estado.LARANJA: e.setColor(Color.ORANGE) break;
        case Estado.VERDE: e.setColor(Color.GREEN) break;
        case Estado.CINZA: e.setColor(Color.GREY) break;
        case Estado.ROXO: e.setColor(Color.PURPLE) break;
        case Estado.BRANCO: e.setColor(Color.WHITE) break;
        case Estado.PRETO: e.setColor(Color.BLACK) break;
    }

    e.fillOval(6,6,getWidth()-12,getHeight()-12);

    e.setColor(Color.GRAY);
      e.drawOval(6,6,getWidth()-12,getHeight()-12);



    /*if(estado == Estado.AZUL)
        e.setColor(Color.BLUE);
    if(estado == Estado.VERMELHO)
        e.setColor(Color.RED);
    if(estado == Estado.AMARELO)
        e.setColor(Color.YELLOW);
    if(estado == Estado.LARANJA)
        e.setColor(Color.ORANGE);*/

}