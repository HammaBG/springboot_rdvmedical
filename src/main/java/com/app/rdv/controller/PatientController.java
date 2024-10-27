package com.app.rdv.controller;

import com.app.rdv.entities.Patient;
import com.app.rdv.service.IServicePatient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/patient")
public class PatientController {
    private IServicePatient servicePatient;
    @PostMapping("add")
    public Patient add(@RequestBody Patient pt)
    {
        return servicePatient.addPatient(pt);
    }
    @GetMapping("all")
    public List<Patient> getListPT()
    {
        return  servicePatient.getListPatient();
    }
}
