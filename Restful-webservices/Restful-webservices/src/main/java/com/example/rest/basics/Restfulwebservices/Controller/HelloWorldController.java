package com.example.rest.basics.Restfulwebservices.Controller;

import com.example.rest.basics.Restfulwebservices.Bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //GET
    //URI- /hello-world
    //method-"Hello World"

    //@RequestMapping(method= RequestMethod.GET,path="/hello-world")
   @GetMapping(path="/hello-world")
    public String HelloWorld()
    {
        return "Hello World Yashoda";
    }
    @GetMapping(path="/hello-world-bean")
     HelloWorldBean HelloWorldBeans()
    {
        return new HelloWorldBean("Hello World Bean");
    }
}
