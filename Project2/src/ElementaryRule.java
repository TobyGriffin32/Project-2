
public class ElementaryRule extends Rule {
	
	
	public ElementaryRule(int ruleNum) {
		super(ruleNum);
		String ruleStr = Integer.toBinaryString(ruleNum);
		while(ruleStr.length() != 8) {
			ruleStr = "0" + ruleStr;
		}
	}

	@Override
	public int getNumSubrules() {
		return 8;
	}

	@Override
	public Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc) {
		Cell[] cellNeighborhood = new Cell[3];
		cellNeighborhood[1] = gen.getCell(cellIdx);
		cellNeighborhood[0] = bc.getNeighbor(cellIdx, -1, gen);
		cellNeighborhood[2] = bc.getNeighbor(cellIdx, 1, gen);
		
		return cellNeighborhood;
	}

	@Override
	public EvolvedCell evolve(Cell[] neighborhood) {
		EvolvedCell newCell;
		if(neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.ON &&
				neighborhood[2].getState() == CellState.ON) {
			newCell = new EvolvedCell(CellState.OFF, 7);
			return newCell;
		}
		else if(neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.ON &&
				neighborhood[2].getState() == CellState.OFF) {
			newCell = new EvolvedCell(CellState.ON, 6);
			return newCell;
		}
		else if(neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.OFF &&
				neighborhood[2].getState() == CellState.ON) {
			newCell = new EvolvedCell(CellState.ON, 5);
			return newCell;
		}
		else if(neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.OFF &&
				neighborhood[2].getState() == CellState.OFF) {
			newCell = new EvolvedCell(CellState.OFF, 4);
			return newCell;
		}
		else if(neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.ON &&
				neighborhood[2].getState() == CellState.ON) {
			newCell = new EvolvedCell(CellState.ON, 3);
			return newCell;
		}
		else if(neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.ON &&
				neighborhood[2].getState() == CellState.OFF) {
			newCell = new EvolvedCell(CellState.ON, 2);
			return newCell;
		}
		else if(neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.OFF &&
				neighborhood[2].getState() == CellState.ON) {
			newCell = new EvolvedCell(CellState.ON, 1);
			return newCell;
		}
		else {
			newCell = new EvolvedCell(CellState.OFF, 0);
			return newCell;
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
