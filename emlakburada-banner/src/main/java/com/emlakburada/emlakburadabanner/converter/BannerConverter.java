package com.emlakburada.emlakburadabanner.converter;

import com.emlakburada.emlakburadabanner.domain.Banner;
import com.emlakburada.emlakburadabanner.model.request.BannerRequest;
import com.emlakburada.emlakburadabanner.model.response.BannerResponse;
import org.springframework.stereotype.Component;

@Component
public class BannerConverter {

    public BannerResponse convert(Banner banner) {
        return BannerResponse.builder()
                .advertNo(banner.getAdvertNo())
                .phone(banner.getPhone())
                .quantity(banner.getQuantity())
                .build();
    }

    public Banner convert(BannerRequest bannerRequest) {
        return Banner.builder()
                .advertNo(bannerRequest.getAdvertNo())
                .phone(bannerRequest.getPhone())
                .quantity(bannerRequest.getQuantity())
                .build();
    }
}