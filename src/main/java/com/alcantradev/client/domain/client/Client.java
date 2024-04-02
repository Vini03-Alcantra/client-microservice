package com.alcantradev.client.domain.client;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.alcantradev.client.infra.client.dto.input.ClientInputDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique=true)
    private String document;

    @Column(unique=true)
    private String email;

    private LocalDate birthday;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<PhoneClient> phones;


    public Client(ClientInputDTO clientInput){
        setFirstName(firstName);
        setLastName(lastName);
        setDocument(document);
        setEmail(email);
        setBirthday(birthday);        
    }

}
