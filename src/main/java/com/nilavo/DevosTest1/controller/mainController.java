package com.nilavo.DevosTest1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class mainController {

    @GetMapping("/first-Url")
    public ResponseEntity<String> first()
    {
        return new ResponseEntity<>("Welcome To Main Controller Class"+this.getClass().getName(), HttpStatus.OK);
    }
}
