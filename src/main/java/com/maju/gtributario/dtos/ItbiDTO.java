package com.maju.gtributario.dtos;

import com.maju.gtributario.entities.Contribuinte;
import com.maju.gtributario.entities.Imovel;
import lombok.AllArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
public class ItbiDTO {
    @NotNull
    public LocalDate dataLancamento;
    @NotNull
    public  double valor;
    @NotNull
    public LocalDate dataTransferencia;
    @NotNull
    public Long imove;
    @NotNull
    public Long proprietario;
    @NotNull
    public Long proprietario_novo;
}
