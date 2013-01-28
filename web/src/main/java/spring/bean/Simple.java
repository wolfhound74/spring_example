package spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Simple {

    @PostConstruct
    public void testPostConstruct(){
        System.out.println("\n-------------------PostConstruct\n");
    }
}
