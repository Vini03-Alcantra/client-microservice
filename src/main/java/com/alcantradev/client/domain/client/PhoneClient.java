package com.alcantradev.client.domain.client;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.alcantradev.client.infra.client.dto.input.PhoneClientInputDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity @Table
@NoArgsConstructor @AllArgsConstructor
public class PhoneClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ddd;

    private String number;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public PhoneClient(PhoneClientInputDTO phoneClientInput){
        setDdd(phoneClientInput.getDdd());
        setNumber(phoneClientInput.getNumber());
    }
}
