package com.alcantradev.client.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;

import com.alcantradev.client.domain.client.Client;
import com.alcantradev.client.infra.client.dto.input.ClientInputDTO;
import com.alcantradev.client.infra.client.dto.output.ClientOutputDTO;
import com.alcantradev.client.repositories.IClientRepository;

public class ClientService {
    private IClientRepository clientRepository;

    public void create(ClientInputDTO clientInput){
        Client client = new Client();
        BeanUtils.copyProperties(clientInput, client);
        clientRepository.save(client);
    }

    public ClientOutputDTO getClientByCpf(String cpf){
        Optional<Client> client = clientRepository.findByCpf(cpf);
        if(!client.isPresent())
            return null;
        
        ClientOutputDTO clientOutputDTO = new ClientOutputDTO();
        BeanUtils.copyProperties(client, clientOutputDTO);

        return clientOutputDTO;
    }

    public ClientOutputDTO getClientById(Long id){
        Optional<Client> client = clientRepository.findById(id);
        if(!client.isPresent())
            return null;
        
        ClientOutputDTO clientOutputDTO = new ClientOutputDTO();
        BeanUtils.copyProperties(client, clientOutputDTO);

        return clientOutputDTO;
    }
}
