package com.alcantradev.client.infra.client.dto.output;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AddressOutputDTO {
    private String street;

    private String neighborhood;

    private String city;

    private String cep;

    private String numberHouse;

    private String complement;
    
    private LocalDateTime createdAt;    
}
