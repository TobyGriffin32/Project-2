
public class FixedBoundaryConditions implements BoundaryConditions {
	
	CellState left;
	CellState right;
	
	public FixedBoundaryConditions(CellState left, CellState right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Cell getNeighbor(int cellIdx, int offset, Generation gen) {
		Cell leftBoundCell = new Cell(left);
		Cell rightBoundCell = new Cell(right);
		if((cellIdx + offset) < 0) {
			return leftBoundCell;
		}
		else if((cellIdx + offset) >= gen.size()) {
			return rightBoundCell;
		}
		else {
			return gen.getCell(cellIdx + offset);
		}
	}
	
	public CellState getLeftState() {
		return left;
	}
	
	public CellState getRightState() {
		return right;
	}
	

}
