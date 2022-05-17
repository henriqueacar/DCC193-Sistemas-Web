package br.ufjf.dcc193.henriquecardoso.exm02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Exm02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Exm02Application.class, args);
		
		PessoaRepository rep = ctx.getBean(PessoaRepository.class);
		rep.save(new Pessoa("Fulano", 23));
		rep.save(new Pessoa("Beltrano", 30));
		rep.save(new Pessoa("Ciclana", 19));
		System.out.println(rep.findAll().toString());


	}

}
