package com.nilavo.DevosTest1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mainControllerTest {


    @Test
    public void firstTest()
    {
        mainController mainController = new mainController();
        ResponseEntity<String> getvalue =mainController.first();
        assertEquals("Welcome To Main Controller Class:com.nilavo.DevosTest1.controller.mainController",getvalue.getBody());
        assertEquals(HttpStatus.OK,getvalue.getStatusCode());
    }

}
