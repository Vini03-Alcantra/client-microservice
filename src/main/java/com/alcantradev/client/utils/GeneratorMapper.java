package com.alcantradev.client.utils;
import org.mapstruct.Mapper;

import com.alcantradev.client.domain.client.Address;
import com.alcantradev.client.domain.client.Client;
import com.alcantradev.client.domain.client.PhoneClient;
import com.alcantradev.client.infra.client.dto.input.AddressInputDTO;
import com.alcantradev.client.infra.client.dto.input.ClientInputDTO;
import com.alcantradev.client.infra.client.dto.input.PhoneClientInputDTO;

@Mapper(componentModel = "spring")
public interface GeneratorMapper {
    AddressInputDTO addressToAddressInputDto(Address address);

    ClientInputDTO clientToClientInputDTO(Client client);

    PhoneClientInputDTO phoneToPhoneClientInputDTO(PhoneClient phone);
}
