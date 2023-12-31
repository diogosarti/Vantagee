package com.osguri.vantage.services;

import com.osguri.vantage.entities.Curso;
import com.osguri.vantage.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;

    public ModelAndView getCursos(){
        ModelAndView cursos = new ModelAndView("src/curso/cursos");
        List<Curso> listCursos = repository.findAll();
        cursos.addObject("listCursos", listCursos);
        return cursos;
    }

}
