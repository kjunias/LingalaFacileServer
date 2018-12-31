package org.kjunias.lingalafacile.translateservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@PropertySource("classpath:application.properties")
@EnableCassandraRepositories(basePackages = "org.kjunias.lingalafacile.translateservice.repository")
class CassandraDatabaseConfig extends AbstractCassandraConfiguration {

	@Value("${spring.data.cassandra.contact-points}")
	private String contactPoints;

	@Value("${spring.data.cassandra.keyspace-name}")
	private String keyspaceName;

	@Override
	public String getContactPoints() {
		return this.contactPoints;
	}

	@Override
	public String getKeyspaceName() {
		return this.keyspaceName;
	}

	@Override
	protected boolean getMetricsEnabled() {
		return false;
	}
}