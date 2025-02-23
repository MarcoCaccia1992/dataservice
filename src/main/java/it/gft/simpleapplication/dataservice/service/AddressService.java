package it.gft.simpleapplication.dataservice.service;

import it.gft.simpleapplication.dataservice.dao.Address;
import it.gft.simpleapplication.dataservice.dto.AddressDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public interface AddressService  {
    String saveAddress(AddressDto address);
}
