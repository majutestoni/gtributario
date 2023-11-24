package com.maju.gtributario.dtos;


import com.maju.gtributario.util.TipoImovel;
import lombok.AllArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
public class ImovelDTO {

    @NotNull
    public LocalDate dataInscricao;
    @NotNull
    public double m2;
    @NotNull
    public double valorVenal;
    @NotNull
    public TipoImovel tipoImovel;

    public Long proprietario;

}
