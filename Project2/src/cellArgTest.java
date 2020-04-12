import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cellArgTest {

	@Test
	void test() {
		Cell cell1 = new Cell(CellState.ON);
		CellState state = cell1.getState();
		assertEquals(CellState.ON, state);
	}

}
