package com.sda.sqL_mapping;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressEntity {
    private Long id;
    private String city;
    private String street;
    private Long flatNumber;
    private String zipCode;
}
