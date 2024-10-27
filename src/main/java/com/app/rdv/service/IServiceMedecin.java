package com.app.rdv.service;


import com.app.rdv.entities.Medecin;

import java.util.List;

public interface IServiceMedecin {
    public abstract Medecin addMedecin(Medecin Medecin);
    public abstract List<Medecin> getListMedecin();
}
