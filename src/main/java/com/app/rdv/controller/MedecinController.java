package com.app.rdv.controller;

import com.app.rdv.entities.Medecin;
import com.app.rdv.service.IServiceMedecin;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/Medecin")
public class MedecinController {
    private final IServiceMedecin servicemd;
    @PostMapping("add")
    public Medecin add(@RequestBody Medecin md)
    {
        return servicemd.addMedecin(md);
    }
    @GetMapping("all")
    public List<Medecin> getListmd()
    {
        return  servicemd.getListMedecin();
    }
}
