
public class CircularBoundaryConditions implements BoundaryConditions {
	
	public CircularBoundaryConditions() {
	}

	@Override
	public Cell getNeighbor(int cellIdx, int offset, Generation gen) {
		if((cellIdx + offset) == gen.size()) {
			return gen.getCell(0);
		}
		else if((cellIdx + offset) < 0) {
			return gen.getCell((gen.size()-1) - Math.abs(cellIdx + offset));
		}
		else {
			return gen.getCell(cellIdx + offset);
		}
	}
	

}
