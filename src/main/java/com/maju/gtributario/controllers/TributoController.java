package com.maju.gtributario.controllers;

import com.maju.gtributario.dtos.TituloDTO;
import com.maju.gtributario.entities.Tributos.IPTU;
import com.maju.gtributario.entities.Tributos.ITBI;
import com.maju.gtributario.repositories.IptuRepository;
import com.maju.gtributario.repositories.ItbiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tributos")
public class TributoController {

    @Autowired
    private IptuRepository iptuRepository;

    @Autowired
    private ItbiRepository itbiRepository;

    @GetMapping
    public ResponseEntity<TituloDTO> consultarTributos(){
        List<IPTU> iptus = iptuRepository.findAll();
        List<ITBI> itbis = itbiRepository.findAll();

        TituloDTO dto = new TituloDTO(iptus, itbis);

        return ResponseEntity.ok().body(dto);



    }

}
