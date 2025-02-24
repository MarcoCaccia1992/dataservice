package it.gft.simpleapplication.dataservice.serviceimpl;

import it.gft.simpleapplication.dataservice.dao.AccountData;
import it.gft.simpleapplication.dataservice.dao.Address;
import it.gft.simpleapplication.dataservice.dto.AccountDataDto;
import it.gft.simpleapplication.dataservice.dto.AddressDto;
import it.gft.simpleapplication.dataservice.repository.AccountDataRepository;
import it.gft.simpleapplication.dataservice.repository.AddressRepository;
import it.gft.simpleapplication.dataservice.service.AccountDataService;
import it.gft.simpleapplication.dataservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountDataServiceImpl implements AccountDataService {

    @Autowired
    private AccountDataRepository addressRepository;

    @Override
    public String saveAccountData(AccountData accountData) {
        AccountDataDto dto = new AccountDataDto();
        dto.setName(accountData.getName());
        dto.setSurname(accountData.getSurname());
        dto.setPhoneNumber(accountData.getPhoneNumber());
        dto.setEmail(accountData.getEmail());


        return addressRepository.save(dto).toString();
    }
}
