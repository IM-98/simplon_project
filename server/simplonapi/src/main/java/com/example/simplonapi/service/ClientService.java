package com.example.simplonapi.service;

import com.example.simplonapi.entity.Client;
import com.example.simplonapi.entity.Reservation;
import com.example.simplonapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService implements IClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Optional<Client> findById(int id) {
        return clientRepository.findById(id);
    }

    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public String deleteByID(int id) {

         clientRepository.deleteById(id);
         return "Client supprimé avec succès";
    }

    @Override
    public String delete(Client client) {
        clientRepository.delete(client);
          return "Client supprimé avec succès";
    }

    @Override
    public Client update(Client client) {
        Optional<Client> clientToUpdate = clientRepository.findById(client.getId());
        if(clientToUpdate.isEmpty()){
            return null;
        }
        Client client1 = clientToUpdate.get();
        client1 = client;
        clientRepository.save(client1);

        return client1;

    }
	@Override
	public Optional<Client> findByMail(String email) {
		return clientRepository.findClientByMail(email);
	}
}
