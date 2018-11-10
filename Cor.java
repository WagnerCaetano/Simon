import java.awt.Color;

public enum Cor {PRETO(0),
				CINZAE(1), 
				AZUL(2),
				VERMELHO(3),
				AMARELO(4),
				LARANJA(5),
				VERDE(6),
				CINZA(7),
				ROXO(8);
	
	private int value;

    private Cor(int value) {
            this.value = value;
    }
    
	public int getValue() { return value; }

	public Color getColor() {
		switch(value)
		{
			case 0: return Color.BLACK;
			case 1: return Color.darkGray;
			case 2: return Color.BLUE;
			case 3: return Color.RED;
			case 4: return Color.YELLOW;
			case 5: return Color.ORANGE;
			case 6: return Color.GREEN;
			case 7: return Color.GRAY;
			case 8: return Color.magenta;
		
		}
		return Color.WHITE;
	}
	public Color getColor(Cor e) {
		switch(e)
		{
			case PRETO: return Color.BLACK;
			case CINZAE: return Color.darkGray;
			case AZUL: return Color.BLUE;
			case VERMELHO: return Color.RED;
			case AMARELO: return Color.YELLOW;
			case LARANJA: return Color.ORANGE;
			case VERDE: return Color.GREEN;
			case CINZA: return Color.GRAY;
			case ROXO: return Color.magenta;
		
		}
		return Color.DARK_GRAY;
	}
}