package com.nilavo.DevosTest1.repository;

import com.nilavo.DevosTest1.entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home,Integer> {
}
