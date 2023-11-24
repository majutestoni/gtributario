package com.maju.gtributario.dtos;

import lombok.AllArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
public class IptuDTO {
    @NotNull
    public LocalDate dataLancamento;
    @NotNull
    public  double valor;
    @NotNull
    public int anoCompetencia;
}
