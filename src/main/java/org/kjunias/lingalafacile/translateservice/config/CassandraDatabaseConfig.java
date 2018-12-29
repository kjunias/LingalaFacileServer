package org.kjunias.lingalafacile.translateservice.config;

import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@EnableCassandraRepositories(basePackages = "org.kjunias.lingalafacile.translateservice.repository")
class CassandraDatabaseConfig {
}