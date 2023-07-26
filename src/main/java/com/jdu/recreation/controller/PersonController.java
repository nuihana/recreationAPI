package com.jdu.recreation.controller;

import com.jdu.recreation.model.vo.PersonVo;
import com.jdu.recreation.service.interfaces.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/person")
public class PersonController {

    private final PersonService personService;

    @PostMapping("/get")
    public ResponseEntity<Object> get(@RequestParam PersonVo vo) {
        return ResponseEntity.ok().body(personService.getRandomPerson(vo));
    }
}
