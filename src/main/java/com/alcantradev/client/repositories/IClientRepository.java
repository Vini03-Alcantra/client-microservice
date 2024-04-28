package com.alcantradev.client.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alcantradev.client.domain.client.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByCpf(String cpf);    
}
