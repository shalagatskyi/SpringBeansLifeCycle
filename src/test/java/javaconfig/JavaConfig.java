package javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import races.BaseRace;
import races.impl.Human;

@Configuration
public class JavaConfig {

    @Bean(name = "human")
    public BaseRace generateHumanSetStyle() {
        BaseRace human = new Human();
        human.setMessage("Опять работа?!");
        return human;
    }

}
