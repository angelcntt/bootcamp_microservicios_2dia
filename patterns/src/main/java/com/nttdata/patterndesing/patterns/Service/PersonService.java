package com.nttdata.patterndesing.patterns.Service;

import com.nttdata.patterndesing.patterns.Config.PersonConfig;
import com.nttdata.patterndesing.patterns.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {


    @Autowired
    private PersonConfig personCnf;

    /**
     * Test build
     */
    public  void testBuilder(){
        Person p1= Person.builder().name("pepe").age(90).build();
        System.out.println("Primera persona creada "+p1);
    }
    /**
     * Test singleton
     */
    public  void testSingleton(){
        Person p1= personCnf.Singleton();
        System.out.println("Persona creada con singleton"+p1);
    }

    /**
     * TEst prototype
     */
    public  void testPrototype(){
        Person p1=personCnf.prototype();
        System.out.println("PErsona creada con prototype"+p1);
    }


}
