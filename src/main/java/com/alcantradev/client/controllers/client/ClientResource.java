package com.alcantradev.client.controllers.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alcantradev.client.infra.client.dto.input.ClientInputDTO;
import com.alcantradev.client.infra.client.dto.output.ClientOutputDTO;
import com.alcantradev.client.services.ClientService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(value = "client")
public class ClientResource {
    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody ClientInputDTO client){
        clientService.create(client);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<ClientOutputDTO> getClientByCpf(@PathVariable String cpf){
        ClientOutputDTO clientOutput = clientService.getClientByCpf(cpf);
        return ResponseEntity.ok().body(clientOutput);
    }

    @GetMapping
    public ResponseEntity<ClientOutputDTO> getClientById(@RequestHeader Long id){
        ClientOutputDTO clientOutput = clientService.getClientById(id);
        return ResponseEntity.ok().body(clientOutput);
    }
}


