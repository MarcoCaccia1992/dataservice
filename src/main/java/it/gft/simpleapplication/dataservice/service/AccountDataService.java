package it.gft.simpleapplication.dataservice.service;

import it.gft.simpleapplication.dataservice.dao.AccountData;
import it.gft.simpleapplication.dataservice.dao.Address;
import org.springframework.stereotype.Service;


@Service
public interface AccountDataService {
    String saveAccountData(AccountData accountData);
}
