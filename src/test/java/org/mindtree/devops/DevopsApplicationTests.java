package org.mindtree.devops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsApplicationTests {

	@Test
	void contextLoads() {
		int var =21;
		var-=20;
		var-=1;
		assertEquals(0, var);
	}

}
