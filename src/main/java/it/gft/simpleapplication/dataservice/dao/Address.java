package it.gft.simpleapplication.dataservice.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private Long idAddress;

    private String street;

    private Long streetNumber;

    private String city;

    private String region;

    private String state;

}
