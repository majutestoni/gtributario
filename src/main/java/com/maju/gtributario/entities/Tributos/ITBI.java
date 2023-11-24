package com.maju.gtributario.entities.Tributos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.maju.gtributario.dtos.IptuDTO;
import com.maju.gtributario.dtos.ItbiDTO;
import com.maju.gtributario.entities.Contribuinte;
import com.maju.gtributario.entities.Imovel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "itbis")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ITBI implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private LocalDate dataLancamento;
    private double valor;

    private LocalDate dataTransferencia;

//    private Long imovel;
//    private Long proprietario;
//    private Long proprietario_novo;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_imovel")
    private Imovel imovel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_proprietario")
    private Contribuinte proprietario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_proprietario_novo")
    private Contribuinte proprietario_novo;

    public ITBI(ItbiDTO dto, Imovel imovel, Contribuinte contribuinte, Contribuinte contribuinteNovo) {
        this.dataLancamento = dto.dataLancamento;
        this.dataTransferencia =dto.dataTransferencia;
        this.valor = dto.valor;

        this.imovel = imovel;
        this.proprietario = contribuinte;
        this.proprietario_novo = contribuinteNovo;

//        this.imovel = dto.imove;
//        this.proprietario = dto.proprietario;
//        this.proprietario_novo = dto.proprietario_novo;
    }
}
