package com.alcantradev.client.infra.client.dto.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class PhoneClientInputDTO {
    private String ddd;

    private String number;
}
