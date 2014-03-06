package com.kjunias;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kjunias.words.Word;

@Controller
public class WordController {
    private static final String template = "Definition of %s";

    @RequestMapping("/words/{word}")
    public @ResponseBody Word getWord(@PathVariable String word) {
    	return new Word(String.valueOf(word), String.format(template, word));
    }
}