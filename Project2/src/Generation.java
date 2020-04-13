
public class Generation {
	
	private Cell[] cells;
	
	public Generation(CellState[] states) {
		cells = new Cell[states.length];
		for(int i = 0; i < cells.length; ++i) {
			this.cells[i] = new Cell(states[i]);
		}
		
		
	}
	
	public Generation(String states) {
		cells = new Cell[states.length()];
		for(int i = 0; i < cells.length; ++i) {
			this.cells[i] = new Cell(CellState.getState(states.charAt(i)));
		}
		
	}
	
	public Generation(Cell[] cells) {
		this.cells = cells;
		Cell[] newCellArr = new Cell[cells.length];
		for(int i = 0; i < newCellArr.length; ++i) {
			newCellArr[i] = cells[i];
		}
		
	}
	
	public int size() {
		return cells.length;
	}
	
	public Cell getCell(int idx) {
		return cells[idx];
		
	}
	
	public String toString() {
		return "";
	}

}
