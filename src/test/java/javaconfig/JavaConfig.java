package javaconfig;

import annotation.EvolvedRaceHandlerBeanFactoryPostProcessor;
import annotation.InjectRandomUnitsAnnotationBeanPostProcessor;
import annotation.ProfilingHandlerBeanPostProcessor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
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

    @Bean
    public static BeanPostProcessor getInjectRandomIntBpp() {
        return new InjectRandomUnitsAnnotationBeanPostProcessor();
    }

    @Bean
    public static BeanPostProcessor getProfilingBpp() {
    return new ProfilingHandlerBeanPostProcessor();
    }

    @Bean
    public static BeanFactoryPostProcessor getDeprecatedRaceBfpp() {
        return new EvolvedRaceHandlerBeanFactoryPostProcessor();
    }
}
