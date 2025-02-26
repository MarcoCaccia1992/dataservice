package it.gft.simpleapplication.dataservice.utils;

import it.gft.simpleapplication.dataservice.dao.AccountData;
import it.gft.simpleapplication.dataservice.dao.Address;
import it.gft.simpleapplication.dataservice.dto.AccountDataDto;
import it.gft.simpleapplication.dataservice.dto.AddressDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Component
public class Utils {

    public void checkAndOrderAddressObjectById(List<Address> addresses){
        Long count = 1L;
        addresses.sort((Address o1, Address o2) -> o1.getIdAddress().compareTo(o2.getIdAddress()));
        for(int i =0; i < addresses.size(); i++){
            addresses.get(i).setIdAddress(count);
            count++;
        }
    }

    public void checkAndOrderAccountDataObjectById(List<AccountData> accountDatas){
        Long count = 1L;
        accountDatas.stream().sorted(Comparator.comparing(AccountData::getIdAccountData));
        for(int i =0; i < accountDatas.size(); i++){
            accountDatas.get(i).setIdAccountData(count);
            count++;
        }
    }

    public List<AccountData> fromDtoToDaoAccountData(List<AccountDataDto> dtoList){
        List<AccountData> accountDataList = new ArrayList<>();
        for(AccountDataDto dto : dtoList){
            accountDataList.add(new AccountData(
                    dto.getIdAccountData(),
                    dto.getName(),
                    dto.getSurname(),
                    dto.getPhoneNumber(),
                    dto.getEmail()
            ));
        }
        return accountDataList;
    }

    public List<AccountDataDto> fromDaoToDtoAccountData(List<AccountData> daoList){
        List<AccountDataDto> accountDataDtoList = new ArrayList<>();
        for(AccountData dao : daoList){
            accountDataDtoList.add(new AccountDataDto(
                    dao.getIdAccountData(),
                    dao.getName(),
                    dao.getSurname(),
                    dao.getPhoneNumber(),
                    dao.getEmail()
            ));
        }
        return accountDataDtoList;
    }

    public List<Address> fromDtoToDaoAddress(List<AddressDto> dtoList){
        List<Address> addressList = new ArrayList<>();
        for(AddressDto dto : dtoList){
            addressList.add(new Address(
                    dto.getIdAddress(),
                    dto.getStreet(),
                    dto.getStreetNumber(),
                    dto.getCity(),
                    dto.getRegion(),
                    dto.getState()
            ));
        }
        return addressList;
    }
}
