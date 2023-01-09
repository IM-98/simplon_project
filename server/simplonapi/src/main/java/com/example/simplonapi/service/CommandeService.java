package com.example.simplonapi.service;

import com.example.simplonapi.entity.Client;
import com.example.simplonapi.entity.Commande;
import com.example.simplonapi.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommandeService implements ICommandeService{

    @Autowired
    CommandeRepository commandeRepository;

    @Override
    public Commande save(Commande commande) {
         return  commandeRepository.save(commande);

    }

    @Override
    public Optional<Commande> findById(int id) {

        return commandeRepository.findById(id);
    }

    @Override
    public Iterable<Commande> findAll() {

        return commandeRepository.findAll();
    }

    @Override
    public String deleteByID(int id) {
        commandeRepository.deleteById(id);

        return "commande supprimé avec succès";
    }

    @Override
    public String delete(Commande commande) {
        commandeRepository.delete(commande);
        return "commande supprimé avec succès";
    }

    @Override
    public Commande update(Commande commande) {
        Optional<Commande> commandeToUpdate = commandeRepository.findById(commande.getId());
        if(commandeToUpdate.isEmpty()){
            return null;
        }
        Commande commande1 = commandeToUpdate.get();
        commande1 = commande;
        commandeRepository.save(commande1);

        return commande1;
    }
}
