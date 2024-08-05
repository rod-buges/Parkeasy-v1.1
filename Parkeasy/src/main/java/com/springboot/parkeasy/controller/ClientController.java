package com.springboot.parkeasy.controller;

import com.springboot.parkeasy.model.Client;
import com.springboot.parkeasy.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService service;

    @GetMapping
    public List<Client> getAllClients() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return service.save(client);
    }

    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
        client.setId(id);
        return service.save(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        service.deleteById(id);
    }
}

