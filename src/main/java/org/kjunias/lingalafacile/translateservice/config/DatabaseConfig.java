package org.kjunias.lingalafacile.translateservice.config;

import org.kjunias.lingalafacile.translateservice.model.Word;
import org.kjunias.lingalafacile.translateservice.repository.WordRepository;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
class DatabaseConfig {
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(DatabaseConfig.class);

	@Bean
	CommandLineRunner initDatabase(WordRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new Word("Lingala", "mbote")));
			log.info("Preloading " + repository.save(new Word("Lingala", "kobina")));
		};
	}
}