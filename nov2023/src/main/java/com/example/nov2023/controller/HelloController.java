package com.example.nov2023.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {


    //URL -   http://localhost:2023/hello/great
    @GetMapping("/great")
    public String sayHello()
    {
        System.out.println("This is a REGULAR sayHello() without parameters");
        return "Welcome to Springboot";
    }


    //URL -   http://localhost:2023/hello/great/Bala
    @GetMapping("/great/{name}")
    public String sayHello(@PathVariable("name") String inputString)
    {
        System.out.println("This is a sayHello() with parameters");

        return "HI "+inputString+ ", Welcome to Springboot";
    }


    //URL -   http://localhost:2023/hello/greatWithParam?name=Bala
    @GetMapping("/greatWithParam")
    public String sayHelloWithParam(@RequestParam("name") String inputString)
    {
        System.out.println("This is a sayHelloWithParam() with parameters "+inputString);

        return "HI "+inputString+ ", Welcome to Springboot";
    }

}
