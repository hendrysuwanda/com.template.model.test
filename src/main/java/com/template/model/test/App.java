package com.template.model.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.template.model.domain.Person;
import com.template.model.service.PersonService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    	    	  new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	PersonService service = (PersonService)appContext.getBean("personService");
    	
    	Person person = new Person();
    	person.setFirstName("Hendry");
    	person.setLastName("Suwanda");
    	
    	service.save(person);
    	
    	List<Person> persons = service.findAll();
    	
    	for(Person per : persons){
    		System.out.println(per);
    	}
    }
}
