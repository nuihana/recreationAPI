package com.jdu.recreation.controller;

import com.jdu.recreation.model.vo.MusicVo;
import com.jdu.recreation.service.interfaces.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/music")
public class MusicController {

    private final MusicService musicService;

    @GetMapping("/get")
    public ResponseEntity<Object> get(@RequestBody MusicVo vo) {
        return ResponseEntity.ok().body(musicService.getMusicList(vo));
    }
}
