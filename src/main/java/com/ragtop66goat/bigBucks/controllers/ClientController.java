package com.ragtop66goat.bigBucks.controllers;

import com.ragtop66goat.bigBucks.entities.Client;
import com.ragtop66goat.bigBucks.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(value="/add")
    public void addClient(@RequestBody Client client) {
        Client newClient = new Client(client);
        clientService.addClient(newClient);
    }

    @PutMapping(value="/reserve")
    public void addReservation(@RequestBody Client client) {
        Client clientReservation = new Client(client);
        clientService.addReservation(clientReservation);
    }

    @GetMapping(value="reservations")
    public Optional<Client> getReservations(@RequestParam Long id){
        return clientService.getReservations(id);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
       clientService.deleteClient(id);
    }


}
