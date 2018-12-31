package org.kjunias.lingalafacile.translateservice;

import org.kjunias.lingalafacile.translateservice.model.Word;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Criteria;
import org.springframework.data.cassandra.core.query.Query;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class TranslateServiceApplication {
	private static Logger logger = LoggerFactory.getLogger(TranslateServiceApplication.class);

	public static void main(String[] args) {
//		initDatabase();
		SpringApplication.run(TranslateServiceApplication.class, args);
	}

	private static void initDatabase() {
	    Cluster cluster = Cluster.builder().addContactPoints("localhost").withoutJMXReporting().build();
	    Session session = cluster.connect("lingalafacile_translate_service");

	    CassandraOperations template = new CassandraTemplate(session);

	    Word mbote = template.insert(new Word("Lingala", "beta"));

	    logger.info(template.selectOne(Query.query(Criteria.where("word").is(mbote.getWord())), Word.class).getWord());

	    template.truncate(Word.class);
	    session.close();
	    cluster.close();
	}

}

