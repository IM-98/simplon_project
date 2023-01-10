package com.example.simplonapi.controller;

import com.example.simplonapi.entity.Commande;
import com.example.simplonapi.service.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/commande")
public class CommandeController {

    @Autowired
    ICommandeService iCommandeService;

    @PostMapping("/new")
    public Commande addNewCommande(@RequestBody Commande commande){
        return iCommandeService.save(commande);
    }
    @GetMapping("/")
    public Iterable<Commande> getCommande(){
        return iCommandeService.findAll();
    }

    @GetMapping("/id:")
    public Optional<Commande> getCommandeById(@RequestParam int id){
        return iCommandeService.findById(id);
    }

    @PutMapping("/update")
    public Commande updateCommande(@RequestBody Commande commande){
        return iCommandeService.update(commande);
    }

    @DeleteMapping("/delete")
    public String deleteCommande(@RequestBody Commande commande){
        return iCommandeService.delete(commande);
    }

    @DeleteMapping("/delete/id")
    public String deleteCommandeId(int id){
        return iCommandeService.deleteByID(id);
    }
}
