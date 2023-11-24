package com.maju.gtributario.repositories;

import com.maju.gtributario.entities.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {

    @Query(value = "SELECT * FROM imoveis WHERE id_proprietario = :id", nativeQuery = true)
    List<Imovel> findByProprietario(Long id);

    @Query(value = "SELECT * FROM imoveis ORDER BY codigo", nativeQuery = true)
    List<Imovel> listar();
}
