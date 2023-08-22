package com.osguri.vantage.config;

import com.osguri.vantage.entities.Curso;
import com.osguri.vantage.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CursoRepository cursoRepository;
    @Override
    public void run(String... args) throws Exception {

        Curso c1 = new Curso(null,"Java","Este é um curso de java");
        Curso c2 = new Curso(null,"PHP","Este é um curso de PHP");

        cursoRepository.saveAll(Arrays.asList(c1, c2));

    }
}
