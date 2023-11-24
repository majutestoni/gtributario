package com.maju.gtributario.dtos;

import com.maju.gtributario.entities.Tributos.IPTU;
import com.maju.gtributario.entities.Tributos.ITBI;
import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.List;

public class TituloDTO {
    public List<IPTU> iptus;
    public List<ITBI> itbis;

    public TituloDTO(List<IPTU> iptus, List<ITBI> itbis) {
        this.iptus = iptus;
        this.itbis = itbis;
    }
}
