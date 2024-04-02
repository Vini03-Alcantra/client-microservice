package com.alcantradev.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alcantradev.client.domain.client.PhoneClient;

public interface IPhoneClientRepository extends JpaRepository<PhoneClient, Long> {
    
}
