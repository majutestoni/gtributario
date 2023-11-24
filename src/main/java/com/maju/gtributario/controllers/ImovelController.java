package com.maju.gtributario.controllers;

import com.maju.gtributario.dtos.ImovelDTO;
import com.maju.gtributario.entities.Contribuinte;
import com.maju.gtributario.entities.Imovel;
import com.maju.gtributario.repositories.ContribuinteRepository;
import com.maju.gtributario.repositories.ImovelRepository;
import com.maju.gtributario.util.Exception.ConflitedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/imovel")
public class ImovelController {

    @Autowired
    private ImovelRepository imovelRepository;

    @Autowired
    private ContribuinteRepository contribuinteRepository;

    @PostMapping
    public ResponseEntity<Imovel> cadastrarImovel(@RequestBody ImovelDTO dto) {
        Contribuinte contribuinte = contribuinteRepository.getOne(dto.proprietario);

        if (contribuinte.getNome() != null) {
            Imovel novo = new Imovel(dto, contribuinte);

            return ResponseEntity.ok().body(imovelRepository.save(novo));
        } else {
            throw new ConflitedException("Proprietario invalido!");
        }
    }

    @GetMapping
    public ResponseEntity<List<Imovel>> consultarImoveis() {
        List<Imovel> imoveis = imovelRepository.listar();

        return ResponseEntity.ok().body(imoveis);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Imovel>> imoveisDeUmProprietario(@PathVariable Long id) {
        List<Imovel> imoveis = imovelRepository.findByProprietario(id);

        return ResponseEntity.ok().body(imoveis);
    }


}
