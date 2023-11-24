package com.maju.gtributario.repositories;

import com.maju.gtributario.entities.Tributos.ITBI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItbiRepository extends JpaRepository<ITBI, Long> {
}
