package it.gft.simpleapplication.dataservice.repository;

import it.gft.simpleapplication.dataservice.dao.Address;
import it.gft.simpleapplication.dataservice.dto.AddressDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository  extends JpaRepository<AddressDto, Long> {
}
