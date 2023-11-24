package com.maju.gtributario.controllers;

import com.maju.gtributario.dtos.ItbiDTO;
import com.maju.gtributario.entities.Contribuinte;
import com.maju.gtributario.entities.Imovel;
import com.maju.gtributario.entities.Tributos.ITBI;
import com.maju.gtributario.repositories.ContribuinteRepository;
import com.maju.gtributario.repositories.ImovelRepository;
import com.maju.gtributario.repositories.ItbiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/itbi")
public class ItbiController {

    @Autowired
    private ItbiRepository itbiRepository;

    @Autowired
    private ImovelRepository imovelRepository;

    @Autowired
    private ContribuinteRepository contribuinteRepository;

    @PostMapping
    public ResponseEntity<String> cadastrarItbi(@RequestBody ItbiDTO dto){
        Imovel imovel = imovelRepository.getOne(dto.imove);

        Contribuinte contribuinte = contribuinteRepository.getOne(dto.proprietario);
        Contribuinte contribuinte_novo = contribuinteRepository.getOne(dto.proprietario_novo);

        ITBI novo = new ITBI(dto, imovel, contribuinte, contribuinte_novo);
//        ITBI novo = new ITBI(dto);
        itbiRepository.save(novo);

        return ResponseEntity.ok().body("ok");
    }

}
