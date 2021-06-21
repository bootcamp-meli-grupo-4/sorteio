package com.sorteio.sorteio.controller;

import com.sorteio.sorteio.entity.Student;
import com.sorteio.sorteio.service.SorteioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sorteio")
public class Sorteio {
    private SorteioService sorteioService;

    public Sorteio(SorteioService sorteioService) {
        this.sorteioService = sorteioService;
    }

    @GetMapping
    public ResponseEntity getSorteio(){
        List<Student> students = sorteioService.doSorteio();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
