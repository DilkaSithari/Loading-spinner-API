package com.example.API.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")

public class con1 {
    @GetMapping("/get")
    public String  getDetails() throws InterruptedException{

        Thread.sleep(3000);
        return "Hello World";

    }

//    public ResponseEntity<String> exampleEndpoint() throws InterruptedException {
//        // Delay the API call for 3 seconds
//        Thread.sleep(3000);
//
//        // Return a response
//        return ResponseEntity.ok("Delayed response");
//    }
}
