package com.iff.dev_web.repository;

import com.iff.dev_web.entities.CdStatusEnum;
import com.iff.dev_web.entities.Financiamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FinanciamentoRepository extends JpaRepository<Financiamento, Long> {

    @Query("SELECT f FROM Financiamento f WHERE f.cdStatus = :status")
    List<Financiamento> buscarFinanciamentoPorStatus(@Param("status") CdStatusEnum status);

    Optional<Financiamento> findByNuContrato(Long nuContrato);
}
