package edu.melnikov.auth_jwe_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@RestController
public class HelloController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Это открытая конечная точка";
    }

    @GetMapping("/private")
    public String privateEndpoint(Principal principal) {
        return "Привет, " + principal.getName() + "! Это защищённая конечная точка";
    }
}