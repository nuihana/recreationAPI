package com.jdu.recreation.controller;

import com.jdu.recreation.service.interfaces.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/music")
public class MusicController {

    private final MusicService musicService;

    @GetMapping("/list")
    public ResponseEntity<Object> list() {
        return ResponseEntity.ok().body(musicService.getMusicList());
    }
}