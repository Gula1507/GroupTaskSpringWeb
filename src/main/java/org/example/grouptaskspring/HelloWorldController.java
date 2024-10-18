package org.example.grouptaskspring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    List<Message> messages = new ArrayList<>();

    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // Das nimmt JSON nicht??
    //    @PostMapping("/messages")
//    public void saveMessage(@RequestParam String id,@RequestParam String name,@RequestParam String message) {
//       Message newMessage=new Message(id,name,message);
//        messages.add(newMessage);
//    }

    @PostMapping("/messages")
    public void saveMessage(@RequestBody Message message) {
        messages.add(message);
    }
}
