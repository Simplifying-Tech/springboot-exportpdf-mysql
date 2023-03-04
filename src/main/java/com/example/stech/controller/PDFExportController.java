package com.example.stech.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.stech.model.Employee;
import com.example.stech.repository.EmployeeRepository;
import com.example.stech.service.DatabasePDFService;

@Controller
public class PDFExportController {
     
    @Autowired
    EmployeeRepository employeeRepository;
 
    @GetMapping(value = "/openpdf/employees", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> employeeReport()  throws IOException {
        List<Employee> employees = (List<Employee>) employeeRepository.findAll();
 
        ByteArrayInputStream bis = DatabasePDFService.employeePDFReport(employees);
 
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=employees.pdf");
 
        return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
}
}