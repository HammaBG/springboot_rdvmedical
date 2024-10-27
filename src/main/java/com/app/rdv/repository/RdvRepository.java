package com.app.rdv.repository;

import com.app.rdv.entities.Rdv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface RdvRepository extends JpaRepository<Rdv,Integer> {

    Rdv findByPatientIdAndDateRdv(int patientId, LocalDateTime dateRdv);
    Rdv findByMedecinOrderByDateRdvAsc (int medecienId, LocalDateTime dateRdv);

    List<Rdv> findAllByOrderByDateRdvAsc();
    ArrayList<Rdv> findByMedecinIdOrderByDateRdvAsc(int medecienId);

}

