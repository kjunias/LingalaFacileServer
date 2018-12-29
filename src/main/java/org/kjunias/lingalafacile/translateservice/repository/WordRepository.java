package org.kjunias.lingalafacile.translateservice.repository;

import org.kjunias.lingalafacile.translateservice.model.Word;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends CassandraRepository<Word, String> {

}
