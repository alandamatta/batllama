package com.llamaworld.batllama.controller;

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
    public ResponseEntity<String> whoAmI() {
        return ResponseEntity.ok("Llama City Vigilante");
    }

    @GetMapping("/help")
    public ResponseEntity<String> callBatllama() {
        log.warn("Help was called");
        return ResponseEntity.ok("Batllama will be on your way shortly...");
    }

}
