package com.app.rdv.service;

import com.app.rdv.entities.Patient;

import java.util.List;

public interface IServicePatient {
    public abstract Patient addPatient(Patient patient);
    public abstract List<Patient> getListPatient();
}

