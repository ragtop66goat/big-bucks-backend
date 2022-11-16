package com.ragtop66goat.bigBucks.repositories;

import com.ragtop66goat.bigBucks.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
