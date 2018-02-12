package com.microservices.poc.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.poc.finance.model.IncomeAndTax;

@Repository
public interface FinanceRepository extends JpaRepository<IncomeAndTax, Long> {

}
