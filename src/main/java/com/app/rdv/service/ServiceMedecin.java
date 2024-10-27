package com.app.rdv.service;

import com.app.rdv.entities.Medecin;
import com.app.rdv.repository.MedecinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceMedecin implements IServiceMedecin {
    private final MedecinRepository medRep;


    @Override
    public Medecin addMedecin(Medecin Med) {
        return medRep.save(Med);
    }

    @Override
    public List<Medecin> getListMedecin() {
        return medRep.findAll();
    }
}

