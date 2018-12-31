package org.kjunias.lingalafacile.translateservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackages = "org.kjunias.lingalafacile.translateservice.repository")
class CassandraDatabaseConfig extends AbstractCassandraConfiguration {

	@Override
	public String getContactPoints() {
		return "localhost";
	}

	@Override
	public String getKeyspaceName() {
		return "lingalafacile_translate_service";
	}

	@Override
	protected boolean getMetricsEnabled() {
		return false;
	}
}