package br.com.lb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @PostMapping("secured")
    public ResponseEntity<String> securedRoute() {
        return new ResponseEntity<>("Opa Secured!", HttpStatus.OK);
    }

}
