package com.kjunias.LingalaFacileServer.test.rest.controller;

import static com.kjunias.LingalaFacileServer.test.rest.controller.fixture.WordRestEventFixtures.wordRequestedNotFound;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import com.kjunias.LingalaFacileServer.core.events.words.RequestWordEvent;
import com.kjunias.LingalaFacileServer.core.services.WordService;
import com.kjunias.LingalaFacileServer.rest.controller.WordQueriesController;

public class ViewWordIntegrationTest {
	MockMvc mockMvc;
	
	@InjectMocks
	WordQueriesController controller;
	
	@Mock
	WordService wordService;
	
	UUID key = UUID.fromString("f3512d26-72f6-4290-9265-63ad69eccc13");
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = standaloneSetup(controller).setMessageConverters(new MappingJackson2HttpMessageConverter()).build();
	}
	
	@Test
	public void thatViewWordRequestUsesHttpNotFound() throws Exception {
		when(wordService.requestWord(any(RequestWordEvent.class))).thenReturn(wordRequestedNotFound(key));
		this.mockMvc.perform(get("/words/{word}", key.toString())
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isNotFound());
	}
}