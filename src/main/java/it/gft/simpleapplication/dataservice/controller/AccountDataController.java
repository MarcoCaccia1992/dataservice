package it.gft.simpleapplication.dataservice.controller;

import it.gft.simpleapplication.dataservice.dao.AccountData;
import it.gft.simpleapplication.dataservice.dao.Address;
import it.gft.simpleapplication.dataservice.serviceimpl.AccountDataServiceImpl;
import it.gft.simpleapplication.dataservice.serviceimpl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accountdata")
public class AccountDataController {

    @Autowired
    private AccountDataServiceImpl accountDataServiceImpl;

    @RequestMapping(value = "/saveaccountdata", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    private String saveAccountData(@RequestBody AccountData accountData) {
        return accountDataServiceImpl.saveAccountData(accountData).toString();

    }
}
