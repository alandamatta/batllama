package com.llamaworld.batllama.controller;

import com.llamaworld.batllama.model.MessageResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batllama")
@Slf4j
public class BatllamaController {

    @GetMapping("whoami")
    public ResponseEntity<MessageResponse> whoAmI() {
        MessageResponse messageResponse = new MessageResponse("Llama City Vigilante");
        return ResponseEntity.ok(messageResponse);
    }

    @GetMapping("/help")
    public ResponseEntity<MessageResponse> callBatllama() {
        MessageResponse messageResponse = new MessageResponse("Batllama will be on your way shortly...");
        log.warn("Help was called");
        return ResponseEntity.ok(messageResponse);
    }

}
