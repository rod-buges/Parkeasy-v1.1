package com.springboot.parkeasy.service;

import com.springboot.parkeasy.model.Client;
import com.springboot.parkeasy.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public List<Client> findAll() {
        return repository.findAll();
    }

    public Optional<Client> findById(Long id) {
        return repository.findById(id);
    }

    public Client save(Client client) {
        return repository.save(client);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
