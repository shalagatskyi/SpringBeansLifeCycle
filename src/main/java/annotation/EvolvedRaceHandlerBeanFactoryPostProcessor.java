package annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EvolvedRaceHandlerBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beans = beanFactory.getBeanDefinitionNames();
        Arrays.stream(beans).forEach(name->{
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            String beanClassName = beanDefinition.getBeanClassName();
            try{
                Class beanClass = Class.forName(beanClassName);
                EvolvedRace annotation = (EvolvedRace) beanClass.getAnnotation(EvolvedRace.class);
                if(annotation != null){
                    beanDefinition.setBeanClassName(annotation.newImpl().getName());
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}
