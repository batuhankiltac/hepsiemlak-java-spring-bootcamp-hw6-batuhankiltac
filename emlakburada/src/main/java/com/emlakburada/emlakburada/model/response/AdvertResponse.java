package com.emlakburada.emlakburada.model.response;

import com.emlakburada.emlakburada.domain.User;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class AdvertResponse {
    private Integer advertNo;
    private String title;
    private Long price;
    private User user;
}