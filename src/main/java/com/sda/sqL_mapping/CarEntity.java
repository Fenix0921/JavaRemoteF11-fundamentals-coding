package com.sda.sqL_mapping;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarEntity {
    private Long id;
    private String brand;
    private String model;
    private String color;
}
