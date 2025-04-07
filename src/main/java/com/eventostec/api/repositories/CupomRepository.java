package com.eventostec.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventostec.api.domain.cupom.Cupom;

public interface CupomRepository extends JpaRepository<Cupom, UUID> {

}
