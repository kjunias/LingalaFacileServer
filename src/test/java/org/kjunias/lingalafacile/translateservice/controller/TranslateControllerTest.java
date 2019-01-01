package org.kjunias.lingalafacile.translateservice.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kjunias.lingalafacile.translateservice.model.Word;
import org.kjunias.lingalafacile.translateservice.service.TranslateService;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(TranslateController.class)
public class TranslateControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TranslateService translateService;

	@Test
	public void testTranslate() throws Exception {
		Word mbote = new Word("Lingala", "mbote");
		Word kobina = new Word("Lingala", "kobina");

		Mockito.when(this.translateService.translateWord("mbote")).thenReturn(mbote);
		Mockito.when(this.translateService.translateWord("kobina")).thenReturn(kobina);

		mockMvc.perform(get("/translate/mbote")).andExpect(status().isOk())
				.andExpect(jsonPath("$.language", Matchers.is("Lingala")))
				.andExpect(jsonPath("$.word", Matchers.is("mbote")));

		mockMvc.perform(get("/translate/kobina")).andExpect(status().isOk())
				.andExpect(jsonPath("$.language", Matchers.is("Lingala")))
				.andExpect(jsonPath("$.word", Matchers.is("kobina")));
	}
}
