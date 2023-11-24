package com.maju.gtributario.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.maju.gtributario.dtos.ImovelDTO;
import com.maju.gtributario.util.TipoImovel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "imoveis")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Imovel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private LocalDate dataInscricao;
    private double m2;
    private double valorVenal;

    private TipoImovel tipoImovel;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_proprietario")
    private Contribuinte proprietario;


    public Imovel(ImovelDTO dto, Contribuinte contribuinte) {
        this.dataInscricao = dto.dataInscricao;
        this.m2 = dto.m2;
        this.valorVenal = dto.valorVenal;
        this.tipoImovel = dto.tipoImovel;
        this.proprietario = contribuinte;
    }
}
