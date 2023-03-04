package com.emlakburada.emlakburada.controller;

import com.emlakburada.emlakburada.model.request.MessageRequest;
import com.emlakburada.emlakburada.model.response.MessageResponse;
import com.emlakburada.emlakburada.service.message.MessageService;
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
@RequestMapping(value = "/messages")
public class MessageController {
    private final MessageService messageService;

    @PostMapping
    public MessageResponse addMessage(@RequestBody MessageRequest messageRequest) {
        return messageService.add(messageRequest);
    }

    @GetMapping
    public List<MessageResponse> getAllMessages() {
        return messageService.getAll();
    }

    @GetMapping(value = "/{id}")
    public MessageResponse getMessageById(@PathVariable Integer id) {
        return messageService.getMessageById(id);
    }

    @PutMapping
    public MessageResponse updateMessage(@RequestBody MessageRequest messageRequest) {
        return messageService.update(messageRequest);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteMessageById(@PathVariable Integer id) {
        messageService.deleteById(id);
    }
}