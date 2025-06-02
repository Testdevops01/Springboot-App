package com.anusha.hello;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloMessage(@RequestParam(defaultValue ="Anusha") String name)
    {
        return "Hello !!"+name+ " Welcome to spring boot >>>";
    }
    @PostMapping("/greet")
    public String greetUser(@RequestBody User user){
        return "Hello,"+user.getName()+"  spring boot says hello ";
    }
}
