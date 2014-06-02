package com.kjunias.LingalaFacileServer.test.rest.controller;

import static com.kjunias.LingalaFacileServer.test.rest.controller.fixture.WordRestDataFixture.wordNotFound;
import static com.kjunias.LingalaFacileServer.test.rest.controller.fixture.WordRestDataFixture.wordRequested;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;

import com.kjunias.LingalaFacileServer.core.services.WordServiceImpl;
import com.kjunias.LingalaFacileServer.rest.controller.WordQueriesController;

public class ViewWordIntegrationTest {
	MockMvc mockMvc;
	
	@InjectMocks
	WordQueriesController controller;
	
	@Mock
	WordServiceImpl wordService;
	
	String testWord = "testWord";
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = standaloneSetup(controller).setMessageConverters(new MappingJackson2HttpMessageConverter()).build();
	}
	
	@Test
	public void thatViewWordRequestUsesHttpNotFound() throws Exception {
		when(wordService.requestWord((any(String.class))))
				.thenReturn(wordNotFound());

		this.mockMvc.perform(get("/words/{word}", testWord)
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isNotFound());
	}
	
	@Test
	public void thatViewWordUsesHttpOK() throws Exception {
		when(wordService.requestWord((any(String.class))))
		.thenReturn(wordRequested());
		
		this.mockMvc.perform(get("/words/{word}", testWord)
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk());
	}
}