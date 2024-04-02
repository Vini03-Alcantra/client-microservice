package com.alcantradev.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alcantradev.client.domain.client.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {
    
}
