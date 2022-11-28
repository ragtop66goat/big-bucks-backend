package com.ragtop66goat.bigBucks.controllers;

import com.ragtop66goat.bigBucks.entities.Client;
import com.ragtop66goat.bigBucks.repositories.ClientRepository;
import com.ragtop66goat.bigBucks.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(value="/add")
    public void addClients(@RequestBody Client client) {
        Client newClient = new Client(client);
    }
}
