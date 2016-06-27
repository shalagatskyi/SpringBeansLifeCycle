package javaconfig;


import annotation.DeprecatedRaceHandlerBeanFactoryPostProcessor;
import annotation.InjectRandomIntAnnotationBeanPostProcessor;
import annotation.ProfilingHandlerBeanPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import races.impl.Human;

@Configuration
@ComponentScan(basePackageClasses = {DeprecatedRaceHandlerBeanFactoryPostProcessor.class,
        InjectRandomIntAnnotationBeanPostProcessor.class,
        ProfilingHandlerBeanPostProcessor.class,
        Human.class})
public class JavaConfig {}
