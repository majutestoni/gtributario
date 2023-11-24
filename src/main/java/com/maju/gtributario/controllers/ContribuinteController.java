package com.maju.gtributario.controllers;

import com.maju.gtributario.dtos.ContribuinteDTO;
import com.maju.gtributario.entities.Contribuinte;
import com.maju.gtributario.repositories.ContribuinteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contribuinte")
public class ContribuinteController {

    @Autowired
    private ContribuinteRepository contribuinteRepository;

    @PostMapping
    public ResponseEntity<Contribuinte> cadastrarContribuinte(@RequestBody ContribuinteDTO dto){
        Contribuinte novo = new Contribuinte(dto);

       return ResponseEntity.ok().body(contribuinteRepository.save(novo));


    }

}
