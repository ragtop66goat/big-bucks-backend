package com.ragtop66goat.bigBucks.controllers;

import com.ragtop66goat.bigBucks.repositories.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping
    public ResponseEntity getAllClients() {
        return ResponseEntity.ok(this.clientRepository.findAll());
    }
}
