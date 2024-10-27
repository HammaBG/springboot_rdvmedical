package com.app.rdv.service;

import com.app.rdv.entities.Patient;
import com.app.rdv.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicePatient implements IServicePatient {
    private final PatientRepository patientrep;
    @Override
    public Patient addPatient(Patient patient) {
        return patientrep.save(patient);
    }

    @Override
    public List<Patient> getListPatient() {
        return patientrep.findAll();
    }
}

