package javaconfig;

import annotation.InjectRandomUnitsAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
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

    @Bean // need to be static to avoid "not eligible for getting processed by all BeanPostProcessors"
    public static BeanPostProcessor getInjectRandomIntBpp() {
        return new InjectRandomUnitsAnnotationBeanPostProcessor();
    }
}
