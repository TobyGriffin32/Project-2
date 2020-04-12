import java.util.Map;

public enum CellState {
	
	OFF(';'), 
	ON('0');
	
	private char symbol;
	private static Map<Character, CellState> SYMBOL_TO_STATE;
	
	private CellState(char symbol) {
		this.symbol = symbol;
	}
	
	public static CellState getState(char symbol) {
		return SYMBOL_TO_STATE.get(symbol);
	}
	
	public String toString() {
		return "" + getState(symbol);
	}

}
