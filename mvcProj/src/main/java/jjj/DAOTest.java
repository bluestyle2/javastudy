package jjj;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import model.BoardDAO2;
import model.BoardDTO;

class DAOTest {

	@Test
	void test1234() {
		//fail("Not yet implemented");
		BoardDTO dto = new BoardDAO2().detail(3);
		assertNotNull(dto);
		
	}

	@Test
	void test55() {
		//fail("Not yet implemented");
		BoardDTO dto = new BoardDAO2().detail(21);
		BoardDTO chk = new BoardDTO();
		chk.setId(21);
		chk.setTitle("제목2");
		chk.setPname("유진2");
		assertEquals(dto, chk);
		
	}
}
