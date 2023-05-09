package com.nttdata.patterndesing.patterns.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configurable
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Cloneable{
    public String name;
    public Integer age;




    @Override
    public String toString(){
        return "Persona "+this.name+" edad "+this.age;
    }
}
