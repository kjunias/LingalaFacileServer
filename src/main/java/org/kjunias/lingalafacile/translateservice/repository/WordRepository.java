package org.kjunias.lingalafacile.translateservice.repository;

import org.kjunias.lingalafacile.translateservice.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, String> {

}
