package com.nilavo.DevosTest1.service;

import com.nilavo.DevosTest1.entity.Home;
import com.nilavo.DevosTest1.repository.HomeRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class HomeService {

    @Autowired
    private HomeRepository repo;

    public List<Home> getHomes(){

        return repo.findAll();

    }

    public Home createHome(Home home) {

        return repo.save(home);
    }

    public Home delete(int id) {

        Optional<Home> home = repo.findById(id);
        repo.delete(home.get());

        return home.get();
    }

    public Home getHomeById(int id) {

        return repo.findById(id).get();
    }
}
