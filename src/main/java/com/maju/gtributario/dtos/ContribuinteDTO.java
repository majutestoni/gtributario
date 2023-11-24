package com.maju.gtributario.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
public class ContribuinteDTO {

    @NotNull
    public String cpf;
    @NotNull
    public String nome;
    @NotNull
    public String telefone;
    @NotNull
    public String email;
}
