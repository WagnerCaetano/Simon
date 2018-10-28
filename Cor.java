public enum Cor {PRETO(0),
				BRANCO(1), 
				AZUL(2),
				VERMELHO(3),
				AMARELO(4),
				LARANJA(5),
				VERDE(6),
				CINZA(7),
				ROXO(8),
				EMPTY(10);
	
	private int value;


    private Cor(int value) {
            this.value = value;
    }
    
    public int getValue() { return value; }
    
    
    
    
	 
}