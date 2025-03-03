package com.nilavo.DevosTest1.controller;

import com.nilavo.DevosTest1.entity.Home;
import com.nilavo.DevosTest1.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService service;

    @GetMapping("/docker ")
    public ResponseEntity<List<Home>> getAllHomeDetails()
    {
        return new ResponseEntity<>(service.getHomes(), HttpStatus.OK);
    }
}
