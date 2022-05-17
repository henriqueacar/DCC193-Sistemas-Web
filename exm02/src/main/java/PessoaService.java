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
}
