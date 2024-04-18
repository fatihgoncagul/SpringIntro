package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       // Desktop dt = context.getBean("beast",Desktop.class);
        //dt.compile();




/*        Desktop dt = context.getBean(Desktop.class);
        dt.compile();
        Desktop dt1 = context.getBean(Desktop.class);
        dt1.compile();

*/

        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();



    }

    // BELOW IS XML CONFIGURATION
/*    public static void main( String[] args )
    {
        // appcontext is responsible for work with that ioc container
        // we can simply create alien object and run the method but we want spring to do the object creation for us
        // there are different ways of configuring spring project and one of them is xml. then well move java based aafter that annotation
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates container, creates the objects with bean tag
        // AFTER CREATING CONTAINER WE NEED TO TELL SPRING THAT WE WANT ALIEN CLASS HANDLED
        //remember! beans are objects that are managed by spring framework
        //we added xml file to resources folder so that spring manages our alien, introduced that class as a bean to spring. we are just working on xml configuration we wont be dealing with this after a while
        // we are doing this to understand spring framework

        Alien obj = (Alien) context.getBean("alien1");// when we say get bean we got a reference for object in the container
        obj.code();// we are working with the object in the container now
        // spring creates beans according to the spring.xml we created
        // if u wrote more than one bean of the same class(in xml config file) it will create it anyway
        // another question: in bean xml config, spring can create beans without id but how can we get that bean if it doesnot have an id?



        Alien obj2 = (Alien) context.getBean("alien1");
        obj2.code();

        // if we get the bean from same id, does spring create another bean for the second obj2 or use the same obj
        // it uses the SAME OBJECT,
        //obj.setAge(21); instead of this line we change xml config file, property, it is called property injection, or setter injectiob cause it uses setter


        System.out.println(obj.getAge());
        //System.out.println(obj2.age);

        //in spring core, we use singleton and prototype

        // this follows singleton cause it will have 1 alien object

        // if we want to change this to use more than one instance of object we can change
        //the scope of bean in xml to "prototype"
        // also in "singleton" the moment we load the app it creates container and objects
        //but if scope is prototype it creates objects when we use getBean

        Alien obj3 = (Alien) context.getBean("alien2"); // scope=prototyype
        obj3.code();

        //getBean returns us type of "OBJECT", what we want is the called object which is alien in this case
        // so we won't need to do type casting
        Desktop desktop1 = context.getBean(Desktop.class);
        Computer desktop2 = context.getBean(Desktop.class);
        Computer com221 = context.getBean(Computer.class);// this works since we set primary key to true, otherwise it will get confused since desktop and laptop both implements the comp. interface

        //Inner beans: look up on in xml file
        



    }*/
}
