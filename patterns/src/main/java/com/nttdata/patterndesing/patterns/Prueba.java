package com.nttdata.patterndesing.patterns;

import com.nttdata.patterndesing.patterns.Service.PersonService;
import com.nttdata.patterndesing.patterns.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Prueba {

    @Autowired
    @Qualifier("singleton")
    private Person  singletonPerson;

    @Autowired
    @Qualifier("prototype")
    private Person prototypePerson;

    @PostConstruct
      public void post(){
        System.out.println(singletonPerson);
        System.out.println(prototypePerson);
    }

}
