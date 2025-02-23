package it.gft.simpleapplication.dataservice.controller;

import it.gft.simpleapplication.dataservice.dao.Address;
import it.gft.simpleapplication.dataservice.dto.AddressDto;
import it.gft.simpleapplication.dataservice.serviceimpl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressServiceImpl addressServiceImpl;

    @RequestMapping(value = "/saveaddress", method = RequestMethod.POST, produces = "application/json")
    private String saveAddress(@RequestBody AddressDto address) {
        return addressServiceImpl.saveAddress(address).toString();

    }
}
