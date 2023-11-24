package com.maju.gtributario.entities;

import com.maju.gtributario.dtos.ContribuinteDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contribuintes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Contribuinte implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String cpf;
    private String nome;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public Contribuinte(ContribuinteDTO dto) {
        this.cpf = dto.cpf;
        this.nome = dto.nome;
        this.telefone = dto.telefone;
        this.email = dto.email;

    }
}
