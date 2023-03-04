package com.emlakburada.emlakburadabanner.service.banner;

import com.emlakburada.emlakburadabanner.converter.BannerConverter;
import com.emlakburada.emlakburadabanner.domain.Banner;
import com.emlakburada.emlakburadabanner.model.request.BannerRequest;
import com.emlakburada.emlakburadabanner.model.response.BannerResponse;
import com.emlakburada.emlakburadabanner.repository.BannerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BannerServiceImpl implements BannerService {
    private final BannerRepository bannerRepository;
    private final BannerConverter bannerConverter;

    @Override
    public List<BannerResponse> getAll() {
        return bannerRepository.findAll().stream()
                .map(bannerConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    public BannerResponse getBannerById(Integer id) {
        Banner banner = bannerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Banner not found."));
        return bannerConverter.convert(banner);
    }

    @Override
    public BannerResponse add(BannerRequest bannerRequest) {
        Banner banner = bannerConverter.convert(bannerRequest);
        return bannerConverter.convert(bannerRepository.save(banner));
    }

    @Override
    public BannerResponse update(BannerRequest bannerRequest) {
        Banner banner = bannerConverter.convert(bannerRequest);
        return bannerConverter.convert(bannerRepository.save(banner));
    }

    @Override
    public void deleteById(Integer id) {
        bannerRepository.deleteById(id);
    }
}