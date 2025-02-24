package it.gft.simpleapplication.dataservice.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "address")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @SequenceGenerator(name = "address_seq", sequenceName = "address_sequence", initialValue = 1, allocationSize = 1)
    @Column(name = "id_address")
    private Long idAddress;

    @Column(name = "street")
    private String street;

    @Column(name = "street_number")
    private Long streetNumber;

    @Column(name = "city")
    private String city;

    @Column(name = "region")
    private String region;

    @Column(name = "state")
    private String state;
}
