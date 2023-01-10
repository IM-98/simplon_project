package com.example.simplonapi.controller;

import com.example.simplonapi.entity.Client;
import com.example.simplonapi.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    IClientService iClientService;

    @PostMapping("/new")
    public Client addNewClient(@RequestBody Client client){
        return iClientService.save(client);
    }
    @GetMapping("/")
    public Iterable<Client> getClient(){
        return iClientService.findAll();
    }

    @GetMapping("/id:")
    public Optional<Client> getClientById(@RequestParam int id){
        return iClientService.findById(id);
    }

    @PutMapping("/update")
    public Client updateClient(@RequestBody Client client){
        return iClientService.update(client);
    }

    @DeleteMapping("/delete")
    public String deleteClient(@RequestBody Client client){
        return iClientService.delete(client);
    }

    @DeleteMapping("/delete/id")
    public String deleteClientId(int id){
        return iClientService.deleteByID(id);
    }

}
