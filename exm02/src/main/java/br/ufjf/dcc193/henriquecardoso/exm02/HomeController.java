package br.ufjf.dcc193.henriquecardoso.exm02;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @RequestMapping("excluir.html")
    public ModelAndView excluirPessoa(Long id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:pessoas.html");
        try{
            ps.excluir(id);
        } catch (Exception e){            
        }
        return mv;
    }

    @RequestMapping("adiciona.html")
    public ModelAndView adicionaPessoa(Pessoa p){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:pessoas.html");
        mv.addObject("pessoa", p);
        ps.adiciona(p);
        return mv;
    }

    @GetMapping("editar.html")
    public ModelAndView editar(Long id){
        ModelAndView mv = new ModelAndView("editar");
        Pessoa p = ps.findById(id);
        mv.addObject("batatinha", p);
        return mv;
    }

    @PostMapping("editar.html")
    public ModelAndView editaPessoa(Pessoa p){
        System.out.println(p.getId()+p.getNome()+p.getIdade());

        ps.edita(p);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:pessoas.html");
        return mv;
    }
    

}
