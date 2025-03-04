package com.nilavo.DevosTest1.controller;

import com.nilavo.DevosTest1.entity.Home;
import com.nilavo.DevosTest1.service.HomeService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService service;



    @GetMapping("/get-Allhome-docker")
    public ResponseEntity<List<Home>> getAllHomeDetails()
    {
        return new ResponseEntity<>(service.getHomes(), HttpStatus.OK);
    }
    @GetMapping("/get-home-docker/{id}")
    public ResponseEntity<Home> getById(@PathVariable int id){

        return new ResponseEntity<>(service.getHomeById(id),HttpStatus.OK);
    }

    @PostMapping("/add-home-docker")
    public ResponseEntity<Home> create(@RequestBody Home home)
    {
        return new ResponseEntity<>(service.createHome(home),HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-home-docker/{id}")
    public ResponseEntity<Home> delete(@PathVariable int id)
    {
        return new ResponseEntity<>(service.delete(id),HttpStatus.OK);
    }
}
