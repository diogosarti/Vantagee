package com.osguri.vantage.services;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class InicioService {

    public ModelAndView getIndex(){
        ModelAndView index = new ModelAndView("index");
        index.addObject("nome", "Diogo");
        return index;
    }

}
