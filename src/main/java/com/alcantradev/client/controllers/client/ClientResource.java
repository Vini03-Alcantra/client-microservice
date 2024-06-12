package com.alcantradev.client.controllers.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alcantradev.client.infra.client.dto.input.ClientInputDTO;
import com.alcantradev.client.infra.client.dto.output.ClientOutputDTO;
import com.alcantradev.client.services.ClientService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping(value = "/client")
@RequiredArgsConstructor
public class ClientResource {
    private final ClientService clientService;
    
    @Value("${via.cep.url}")
    public String url;
    
    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody ClientInputDTO client){
        clientService.create(client);
        return ResponseEntity.ok().build();
    }

    @GetMapping("detailsc")
    public ResponseEntity<String> getClientsDetais(){
        return ResponseEntity.ok().body(url);
    }

    @GetMapping
    public ResponseEntity<ClientOutputDTO> getClients(){
        ClientOutputDTO clientOutput = clientService.findAllClients();
        return ResponseEntity.ok().body(clientOutput);
    }

    @GetMapping(value = "/details")
    public ResponseEntity<ClientOutputDTO> getClientById(@RequestHeader Long id){
        ClientOutputDTO clientOutput = clientService.getClientById(id);
        return ResponseEntity.ok().body(clientOutput);
    }
}


