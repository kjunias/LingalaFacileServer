package org.kjunias.lingalafacile.translateservice.service;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kjunias.lingalafacile.translateservice.model.Word;
import org.kjunias.lingalafacile.translateservice.repository.WordRepository;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TranslateServiceTest {

	@Autowired
	private TranslateService translateService;

	@MockBean
	@Autowired
	private WordRepository wordRepository;

	@Test
	public void testTranslate() throws Exception {
		Optional<Word> mbote = Optional.ofNullable(new Word("Lingala", "mbote"));
		Optional<Word> kobina = Optional.ofNullable(new Word("Lingala", "kobina"));

		Mockito.when(this.wordRepository.findById("mbote")).thenReturn(mbote);
		Mockito.when(this.wordRepository.findById("kobina")).thenReturn(kobina);

		assertEquals(mbote.get().getLanguage(), this.translateService.translateWord("mbote").getLanguage());
		assertEquals(mbote.get().getWord(), this.translateService.translateWord("mbote").getWord());

		assertEquals(kobina.get().getLanguage(), this.translateService.translateWord("kobina").getLanguage());
		assertEquals(kobina.get().getWord(), this.translateService.translateWord("kobina").getWord());
	}
}
