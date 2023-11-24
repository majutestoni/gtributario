package com.maju.gtributario.controllers;

import com.maju.gtributario.dtos.IptuDTO;
import com.maju.gtributario.entities.Tributos.IPTU;
import com.maju.gtributario.repositories.IptuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/iptu")
public class IptuController {

    @Autowired
    private IptuRepository iptuRepository;

    @PostMapping
    public ResponseEntity<IPTU> cadastrarIptu(@RequestBody IptuDTO dto){
        IPTU novo = new IPTU(dto);

        return ResponseEntity.ok().body(iptuRepository.save(novo));

    }


}
