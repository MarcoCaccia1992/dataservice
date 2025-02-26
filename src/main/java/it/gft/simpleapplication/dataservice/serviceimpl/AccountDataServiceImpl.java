package it.gft.simpleapplication.dataservice.serviceimpl;

import it.gft.simpleapplication.dataservice.dao.AccountData;
import it.gft.simpleapplication.dataservice.dto.AccountDataDto;
import it.gft.simpleapplication.dataservice.repository.AccountDataRepository;
import it.gft.simpleapplication.dataservice.service.AccountDataService;
import it.gft.simpleapplication.dataservice.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class AccountDataServiceImpl implements AccountDataService {

    @Autowired
    private AccountDataRepository accountDataRepositorty;

    @Autowired
    private Utils utils;


    @Override
    @Transactional
    public String saveAccountData(AccountData accountData) {

            AccountDataDto dto = new AccountDataDto();
            dto.setName(accountData.getName());
            dto.setSurname(accountData.getSurname());
            dto.setPhoneNumber(accountData.getPhoneNumber());
            dto.setEmail(accountData.getEmail());

            accountDataRepositorty.save(dto);

        return accountData.toString();
    }














}




