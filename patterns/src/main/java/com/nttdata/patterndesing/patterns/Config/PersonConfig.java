package com.nttdata.patterndesing.patterns.Config;

import com.nttdata.patterndesing.patterns.entity.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com/nttdata/patterndesing/patterns/Service")
public class PersonConfig {

    @Bean(name = "singleton")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public  Person Singleton(){
        return new Person("Angel",23);
    }


    @Bean(name = "prototype")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public  Person prototype() {
        return new Person("PEPE2",45);
    }
}
