package com.maju.gtributario.repositories;

import com.maju.gtributario.entities.Tributos.IPTU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IptuRepository extends JpaRepository<IPTU, Long> {
}
