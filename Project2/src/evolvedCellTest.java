import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class evolvedCellTest {

	@Test
	void test() {
		EvolvedCell cell1 = new EvolvedCell(CellState.ON, 3);
		CellState state1 = cell1.getState();
		assertEquals(CellState.ON, state1);
	}

}
