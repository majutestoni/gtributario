package com.maju.gtributario.repositories;

import com.maju.gtributario.entities.Contribuinte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContribuinteRepository  extends JpaRepository<Contribuinte, Long> {
}
