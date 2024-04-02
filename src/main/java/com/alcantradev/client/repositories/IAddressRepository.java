package com.alcantradev.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alcantradev.client.domain.client.Address;

public interface IAddressRepository extends JpaRepository<Address, Long>{
    
}
