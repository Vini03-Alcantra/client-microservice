package com.alcantradev.client.infra.client.dto.input;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ClientInputDTO {
    private String firstName;

    private String lastName;

    private String document;

    private String email;
    
    private LocalDate birthday;

    private AddressInputDTO address;

    private PhoneClientInputDTO phone;
}
