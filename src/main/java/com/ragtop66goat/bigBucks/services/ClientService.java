package com.ragtop66goat.bigBucks.services;

import com.ragtop66goat.bigBucks.entities.Client;
import com.ragtop66goat.bigBucks.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public void addClient(Client client){
        clientRepository.save(client);
    }

    public Optional<Client> getReservations(Long id){
        return clientRepository.findById(id);
    }

    public void addReservation(Client client){
        if(clientRepository.findById(client.id).isPresent()){
            clientRepository.findById(client.id).map(current -> {
                current.setEmail(client.getEmail());
                current.setId(client.getId());
                current.setStartDate(client.getStartDate());
                current.setEndDate(client.getEndDate());
                return clientRepository.save(current);
            });
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
