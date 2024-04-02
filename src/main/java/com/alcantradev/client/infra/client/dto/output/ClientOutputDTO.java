package com.alcantradev.client.infra.client.dto.output;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ClientOutputDTO {
    private String firstName;

    private String lastName;

    private String document;

    private String email;

    private LocalDate birthday;

    private LocalDateTime createdAt;
    
    private LocalDateTime updatedAt;
}
