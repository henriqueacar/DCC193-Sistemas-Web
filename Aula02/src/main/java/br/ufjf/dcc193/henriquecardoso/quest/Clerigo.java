package br.ufjf.dcc193.henriquecardoso.quest;

import org.springframework.stereotype.Component;

@Component("clerigo")
public class Clerigo implements Heroi {
    public Clerigo(){
        System.out.println("Um novo clerigo chega ao reino...");
    }

    public void agir(){
        System.out.println("O clérigo cura!");
    }
}
