package com.osguri.techskills.resources;

import com.osguri.techskills.services.InicioService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class InicioResource {

    @Autowired
    private InicioService service;

    @GetMapping
    public ModelAndView inicio(){
        return service.getIndex();
    }
}
