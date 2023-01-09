package com.example.simplonapi.service;

import com.example.simplonapi.entity.Client;

import java.util.Optional;

public interface IClientService {

    Client save(Client client);

    Optional<Client> findById(int id);

    Iterable<Client> findAll();

    String deleteByID(int id);

    String delete(Client client);

    Client update( Client client);
}
