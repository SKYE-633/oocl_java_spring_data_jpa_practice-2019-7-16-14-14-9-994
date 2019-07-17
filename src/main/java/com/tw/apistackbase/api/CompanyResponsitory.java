package com.tw.apistackbase.responsitory;


import com.tw.apistackbase.core.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyResponsitory extends JpaRepository<Company, Long> {


    Iterable<Company> findALL();
}