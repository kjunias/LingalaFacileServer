package org.kjunias.lingalafacile.translateservice;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kjunias.lingalafacile.translateservice.controller.TranslateController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TranslateServiceApplicationTests {
	
	@Autowired
	private TranslateController translateController;

	@Test
	public void contextLoads() {
		assertNotNull(this.translateController);
	}
}

