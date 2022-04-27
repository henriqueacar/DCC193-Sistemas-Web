package br.ufjf.dcc193.henriquecardoso.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(QuestApplication.class, args);
		System.out.println("Hora da Aventura");

		Heroi h1 = ctx.getBean(Cavaleiro.class);
		
		Missao m1 = ctx.getBean(Missao.class);
		m1.iniciar();
		m1.concluir();
	}

}
