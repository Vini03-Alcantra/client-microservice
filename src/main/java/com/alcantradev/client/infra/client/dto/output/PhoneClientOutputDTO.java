package com.alcantradev.client.infra.client.dto.output;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class PhoneClientOutputDTO {
    private String ddd;

    private String number;

    private LocalDateTime createdAt;
}
