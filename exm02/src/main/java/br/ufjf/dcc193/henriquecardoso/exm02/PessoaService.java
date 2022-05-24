package br.ufjf.dcc193.henriquecardoso.exm02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    
    @Autowired
    private PessoaRepository rep;
    List<Pessoa> listAll(){
        return rep.findAll();
    };

    public void excluir(Long id){
        rep.deleteById(id);
    }

    public void adiciona(Pessoa p){
        rep.save(p);
    }

    public void edita(Pessoa p){
        rep.save(p);
    }
     
    public void edita(Long id, String nome, Integer idade){
        Pessoa p = findById(id);
        p.setNome(nome);
        p.setIdade(idade);
        rep.save(p);
    }

    public Pessoa findById(Long id){
        return rep.getById(id);
    }
}
