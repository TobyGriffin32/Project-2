import java.util.List;

public class Automaton {
	
	private Rule rule;
	private List<Generation> generation;
	private BoundaryConditions bc;
	
	public Automaton(Rule rule, Generation init, BoundaryConditions bc) {
		this.rule = rule;
		this.bc = bc;
	}
	
	public Rule getRule() {
		return rule;
	}
	
	public Generation getGeneration(int stepNum) {
		return generation.get(stepNum);
	}
	
	public BoundaryConditions getBoundaryConditions() {
		return bc;
	}
	
	public void evolve(int numSteps) {
		
	}
	
	public int getTotalSteps() {
		return 0;
	}
	
	public String toString() {
		return "";
	}
	
	public String getHistory() {
		return "";
	}
	
	

}
