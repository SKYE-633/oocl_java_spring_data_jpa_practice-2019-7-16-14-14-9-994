package com.tw.apistackbase.responsitory;

import com.tw.apistackbase.core.CompanyProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyProfileResponsitory extends JpaRepository<CompanyProfile ,Long> {
}
