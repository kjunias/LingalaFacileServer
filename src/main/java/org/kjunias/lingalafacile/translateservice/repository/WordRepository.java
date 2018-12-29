package org.kjunias.lingalafacile.translateservice.repository;

import org.kjunias.lingalafacile.translateservice.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, String> {

}
