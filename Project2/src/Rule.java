
public abstract class Rule {
	
	private int ruleNum;
	
	protected Rule(int ruleNum) {
		this.ruleNum = ruleNum;
		//String ruleNumStr = Integer.toBinaryString(ruleNum);
	}
	
	public int getRuleNum() {
		return ruleNum;
	}
	
	public Generation evolve(Generation gen, BoundaryConditions bs) {
		EvolvedCell[] newCells = new EvolvedCell[gen.size()];
		for(int i = 0; i < newCells.length; ++i) {
			newCells[i] = evolve(getNeighborhood(i, gen, bs));
		}
		Generation newGen = new Generation(newCells);
		return newGen;
	}
	
	public abstract int getNumSubrules();
	
	public abstract Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc);
	
	public abstract EvolvedCell evolve(Cell[] neighborhood);
	
	public abstract String toString();

}
