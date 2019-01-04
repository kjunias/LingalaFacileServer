package org.kjunias.lingalafacile.translateservice.config;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.kjunias.lingalafacile.translateservice.model.Word;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@PropertySource("classpath:application.properties")
@EnableCassandraRepositories(basePackages = "org.kjunias.lingalafacile.translateservice.repository")
class CassandraDatabaseConfig extends AbstractCassandraConfiguration {

	private Logger logger = LoggerFactory.getLogger(CassandraDatabaseConfig.class);

	@Value("${spring.data.cassandra.contact-points}")
	private String contactPoints;

	@Value("${spring.data.cassandra.keyspace-name}")
	private String keyspaceName;

	@Value("${spring.data.cassandra.schema-action}")
	private String schemaAction;

	private final long REPLICATION_FACTOR = 3;

	@Override
	public String getContactPoints() {
		return this.contactPoints;
	}

	@Override
	public String getKeyspaceName() {
		return this.keyspaceName;
	}

	@Override
	public SchemaAction getSchemaAction() {
		return SchemaAction.CREATE_IF_NOT_EXISTS;
	}

	@Override
	protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
		CreateKeyspaceSpecification specification = CreateKeyspaceSpecification.createKeyspace(this.keyspaceName)
				.ifNotExists().withSimpleReplication(REPLICATION_FACTOR);
		return Arrays.asList(specification);
	}

	@Override
	public String[] getEntityBasePackages() {
		return new String[] { "org.kjunias.lingalafacile.translateservice.model" };
	}

	@Override
	protected boolean getMetricsEnabled() {
		return false;
	}

	@PostConstruct
	public void initDatabase() throws Exception {
		this.logger.info("Initializing database");
		CassandraOperations cassandraOperations = this.cassandraTemplate();
		Word mbote = new Word("Lingala", "mbote");
		Word kobina = new Word("Lingala", "kobina");
		cassandraOperations.insert(mbote);
		cassandraOperations.insert(kobina);
	}
}