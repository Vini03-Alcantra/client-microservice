package com.alcantradev.client.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.alcantradev.client.domain.client.Client;
import com.alcantradev.client.infra.client.dto.input.ClientInputDTO;
import com.alcantradev.client.infra.client.dto.output.ClientOutputDTO;
import com.alcantradev.client.repositories.IClientRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final IClientRepository clientRepository;

    public void create(ClientInputDTO clientInput){
        Client client = new Client();
        BeanUtils.copyProperties(clientInput, client);
        clientRepository.save(client);
    }

    public ClientOutputDTO findAllClients(){
        List<Client> client = clientRepository.findAll();
        if(client.isEmpty())
            return null;
        
        ClientOutputDTO clientOutputDTO = new ClientOutputDTO();
        BeanUtils.copyProperties(client, clientOutputDTO);

        return clientOutputDTO;
    }

    public ClientOutputDTO getClientByCpf(String document){
        Optional<Client> client = clientRepository.findByDocument(document);
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
