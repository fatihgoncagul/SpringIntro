package org.example.config;


// we will do java based configuration so
//this will replace out XML configuration

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration // this annotation needs to be written for specifying config class
@ComponentScan("org.example")
public class AppConfig {

/*    @Bean(name = {"com2","desktop1","beast"})
    public Desktop desktop1(){ // bean names is set to method name by default
        return new Desktop();
    }*/
    // we know that every bean by default will be singleton
    // how can we change it to prototype, and how can we make it primary bean


/*    @Bean
   // @Scope("prototype") // with this scope config, we can create multiple beans in container
    public Desktop desktop(){

        return new Desktop();
    }*/

/*    @Bean
    public Alien alien(Computer com){ // @Qualifier("desktop"), @Autowired (this is optinal on the constructor)
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com); // we can directly pass the desktop() method but it can also be a laptop, so we ca specify it in the constructor. it will look at the contaqiner and look for computer object, get the desktop obj
        return obj;
    }*/
    // but what if we had multiple computer objects? then we need to specify primary bean
    //  @Qualifier annotation on constructor or primary annotation

/*    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }*/

}
