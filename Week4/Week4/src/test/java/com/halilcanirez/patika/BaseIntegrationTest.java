package com.halilcanirez.patika;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseIntegrationTest {


    @LocalServerPort
    protected int serverPort;
    // random port verdiğinde bu porta erişmek için

    @Autowired
    protected TestRestTemplate testRestTemplate;
    // rest apitesti kendi kodumuz için , başka apileri test etmek için RestTemplate


    @Test
    void contextLoads() {
    }
    // spring configiration (anatosyonlar mesela) test için

}
