import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cellNoArgTest {

	@Test
	void test() {
		Cell cell1 = new Cell();
		CellState state = cell1.getState();
		assertEquals(CellState.OFF, state);
	}

}
