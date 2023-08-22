package com.osguri.techskills.resources;

import com.osguri.techskills.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cursos")
public class CursoResource {

    @Autowired
    private CursoService service;

    @GetMapping
    public ModelAndView findAll(){
        return service.getCursos();
    }

}
