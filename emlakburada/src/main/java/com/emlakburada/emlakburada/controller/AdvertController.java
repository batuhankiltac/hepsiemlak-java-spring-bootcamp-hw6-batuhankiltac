package com.emlakburada.emlakburada.controller;

import com.emlakburada.emlakburada.model.request.AdvertRequest;
import com.emlakburada.emlakburada.model.response.AdvertResponse;
import com.emlakburada.emlakburada.service.advert.AdvertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/adverts")
public class AdvertController {
    private final AdvertService advertService;

    @PostMapping
    public AdvertResponse addAdvert(@RequestBody AdvertRequest advertRequest) {
        return advertService.add(advertRequest);
    }

    @GetMapping
    public List<AdvertResponse> getAllAdverts() {
        return advertService.getAll();
    }

    @GetMapping(value = "/{id}")
    public AdvertResponse getAdvertById(@PathVariable Integer id) {
        return advertService.getAdvertById(id);
    }

    @PutMapping
    public AdvertResponse updateAdvert(@RequestBody AdvertRequest advertRequest) {
        return advertService.update(advertRequest);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteAdvertById(@PathVariable Integer id) {
        advertService.deleteById(id);
    }
}