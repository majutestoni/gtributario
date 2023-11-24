package com.maju.gtributario.entities.Tributos;


import com.maju.gtributario.dtos.IptuDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "iptus")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IPTU implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private LocalDate dataLancamento;
    private double valor;
    private int anoCompetencia;

    public IPTU(IptuDTO dto) {
        this.anoCompetencia = dto.anoCompetencia;
        this.valor = dto.valor;
        this.dataLancamento = dto.dataLancamento;

    }
}
