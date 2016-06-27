package javaconfig;


import annotation.InjectRandomIntAnnotationBeanPostProcessor;
import annotation.ProfilingHandlerBeanPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import races.BaseRace;
import races.impl.Human;

public class JavaConfig {

    @Bean(name = "human")
    public BaseRace generateHumanSetStyle() {
        BaseRace human = new Human();
        human.setMessage("Опять работа?!");
        return human;
    }

    @Bean
    public BeanPostProcessor getInjectRandomIntBpp() {
        return new InjectRandomIntAnnotationBeanPostProcessor();
    }

    @Bean
    public BeanPostProcessor getProfilingBpp() {
    return new ProfilingHandlerBeanPostProcessor();
    }
}
