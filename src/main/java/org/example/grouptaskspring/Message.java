package org.example.grouptaskspring;
//Step 1: Create a new class 'Message' with the fields 'name', 'message', and 'id' of type String.
//
//        Step 2: The controller should now have a list of Message objects.
//
//Step 3: Implement an additional controller method that handles a POST request to '/api/messages'.
//This method should accept an id, a name, and a message in the request body and store them in the list.

import lombok.AllArgsConstructor;


@AllArgsConstructor


public class Message {
    String name;
    String message;
    String id;
}
