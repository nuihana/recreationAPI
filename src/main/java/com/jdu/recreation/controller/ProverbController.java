package com.jdu.recreation.controller;

import com.jdu.recreation.model.vo.ProverbVo;
import com.jdu.recreation.service.interfaces.ProverbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/proverb")
public class ProverbController {

    private final ProverbService proverbService;

    @PostMapping("/get")
    public ResponseEntity<Object> get(@RequestBody ProverbVo vo) {
        return ResponseEntity.ok().body(proverbService.getRandomProverb(vo));
    }
}
