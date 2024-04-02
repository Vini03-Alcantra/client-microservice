package com.alcantradev.client.domain.client;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.alcantradev.client.infra.client.dto.input.AddressInputDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String neighborhood;

    private String city;

    private String cep;

    private String numberHouse;

    private String complement;
    
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public Address(AddressInputDTO addressInput){
        setStreet(street);
        setNeighborhood(neighborhood);
        setCity(city);
        setCep(cep);
        setNumberHouse(numberHouse);
        setComplement(complement);
    }
}
