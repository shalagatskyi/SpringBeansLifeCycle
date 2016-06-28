package annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import races.BaseRace;
import races.impl.Undead;

import java.lang.reflect.Method;
import java.util.Arrays;

@Component
public class EvolvedRaceHandlerBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beans = beanFactory.getBeanNamesForType(BaseRace.class);
        for (String name : beans) {
            BeanDefinition bd = beanFactory.getBeanDefinition(name);
            bd.setFactoryMethodName("generateEvolvedRace");
        }

    }
}
