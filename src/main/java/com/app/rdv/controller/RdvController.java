    package com.app.rdv.controller;

    import com.app.rdv.entities.Rdv;
    import com.app.rdv.repository.RdvRepository;
    import com.app.rdv.service.IServiceRdv;
    import lombok.AllArgsConstructor;
    import org.springframework.web.bind.annotation.*;
    import java.util.List;

    @RestController
    @AllArgsConstructor
    @RequestMapping("/api/rdv/")
    public class RdvController {
        private final RdvRepository rdvRepository;
        private IServiceRdv serviceRdv;

        @PostMapping("addrdv")
        public Rdv add(@RequestBody Rdv rdv)
        {
            return serviceRdv.addRdv(rdv);
        }
        @GetMapping("all")
        public List<Rdv> getListRDV()
        {
            return  serviceRdv.getListRDV();
        }

        /*@GetMapping("bydoctordate")
        public List<Rdv> getSortedRdvs() {
            return rdvRepository.findAllByOrderByDateRdvAsc();
        }*/
    }
