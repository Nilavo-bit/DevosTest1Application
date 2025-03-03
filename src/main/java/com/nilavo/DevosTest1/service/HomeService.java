package com.nilavo.DevosTest1.service;

import com.nilavo.DevosTest1.entity.Home;
import com.nilavo.DevosTest1.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    private HomeRepository repo;


    public List<Home> getHomes(){

        return repo.findAll();

    }
}
