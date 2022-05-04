package br.ufjf.dcc193.henriqueacar.aula03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Aula03Controller {

    @RequestMapping({"", "index.html"})
    public String home(){
        return "basic/home";
    }

    @RequestMapping({"formulario", "formulario.html"})
    public String formulario(){
        return "form/formulario";
    }

    @RequestMapping({"resultado.html"})
    public ModelAndView resultado(Pessoa p){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("form/resultado");
        mv.addObject("pessoa", p);
        return mv;
    }
}
