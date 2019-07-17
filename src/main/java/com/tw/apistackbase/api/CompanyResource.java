package com.tw.apistackbase.api;

import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.responsitory.CompanyResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyResource {

    @Autowired
    private CompanyResponsitory companyResponsitory;

    @GetMapping(produces = {"application/json"})
    public ResponseEntity list() {
        Iterable<Company> companies = companyResponsitory.findALL();
        return ResponseEntity.ok().body(companies);
    }

    @PostMapping(produces = {"application/json"})
    public Company add(@RequestBody Company company){
        companyResponsitory.saveAndFlush(company);
        return companyResponsitory.findAll().get(0);
    }
}
