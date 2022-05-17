import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    PessoaService ps;

    @RequestMapping({"", "index.html"})
    public String home(){
        return "home";
    }

    @RequestMapping("formulario.html")
    public String formulario(){
        return "formulario";
    }
    @RequestMapping("resultado.html")
    public ModelAndView resultado(Pessoa p){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("resultado");
        mv.addObject("pessoa", p);
        return mv;
    }

    @RequestMapping("pessoas.html")
    public ModelAndView resultado(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pessoas");
        List<Pessoa> pl = ps.listAll();
        mv.addObject("pessoas", pl);
        return mv;
    }
    
}
