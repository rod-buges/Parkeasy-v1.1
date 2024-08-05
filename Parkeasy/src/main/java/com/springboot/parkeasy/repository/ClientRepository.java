package com.springboot.parkeasy.repository;

import com.springboot.parkeasy.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

