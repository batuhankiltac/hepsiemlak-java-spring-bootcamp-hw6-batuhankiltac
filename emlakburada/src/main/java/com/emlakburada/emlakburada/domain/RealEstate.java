package com.emlakburada.emlakburada.domain;

import com.emlakburada.emlakburada.domain.enums.RealEstateType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RealEstate {

    private Address address;
    private RealEstateType realEstateType;
    private String rooms;
    private Integer size;
    private Integer floor;
}