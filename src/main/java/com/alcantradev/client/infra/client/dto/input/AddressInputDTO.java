package com.alcantradev.client.infra.client.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class AddressInputDTO {
    private String street;

    private String neighborhood;

    private String city;

    private String cep;

    private String numberHouse;

    private String complement;
}
