package com.example.simplonapi.repository;

import com.example.simplonapi.entity.Client;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client,Integer> {
    Client findClientByMail(String email);
}
