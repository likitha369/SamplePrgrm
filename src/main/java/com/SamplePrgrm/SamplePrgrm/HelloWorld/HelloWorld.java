package com.SamplePrgrm.SamplePrgrm.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String printMsg(){
        return "Hello World!";
    }
    @GetMapping("/hello/{name}")
    public String printMsgName(@PathVariable("name") String name){
        return "Hello "+ name;
    }
}
