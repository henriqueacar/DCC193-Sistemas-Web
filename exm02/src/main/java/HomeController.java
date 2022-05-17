import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
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


    
}
