package com.app.rdv.service;

import com.app.rdv.entities.Rdv;
import com.app.rdv.repository.RdvRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ServiceRdv implements  IServiceRdv {

    private final RdvRepository rdvRepository;
    @Override
    public Rdv addRdv(Rdv rdv) {
        Rdv rdv1 = rdvRepository.findByPatientIdAndDateRdv(rdv.getPatient().getId() , rdv.getDateRdv());
        Rdv rdv2 = rdvRepository.findByMedecinOrderByDateRdvAsc(rdv.getMedecin().getId() , rdv.getDateRdv());

        if(rdv1 == null && rdv2 == null)
            return rdvRepository.save(rdv);
        else
            return  rdvRepository.save(rdv);

    }
    @Override
    public List<Rdv> getListRDV() {
        return rdvRepository.findAll();
    }

    public List<Rdv> getRdvByMedecinAndDate(int id , String date) {
        ArrayList<Rdv> res = new ArrayList<>();
        LocalDate date1 = LocalDate.parse(date);
        List<Rdv> l = rdvRepository.findByMedecinIdOrderByDateRdvAsc(id);
        for (Rdv rdv : l) {
            LocalDate date2 = rdv.getDateRdv().toLocalDate();
            if(date2.equals(date1))
                res.add(rdv);
        }
        return  res;
    }
}
