package com.aziz.azizguebsi.controllers;

import com.aziz.azizguebsi.models.Evenement;
import com.aziz.azizguebsi.models.Logistique;
import com.aziz.azizguebsi.models.Participant;
import com.aziz.azizguebsi.services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
public class RestControllerImpl {
    IService service;
    @PostMapping("/participant")
    void ajouterParticipant(@RequestBody Participant participant) {
        service.ajouterParticipant(participant);
    }

    @PostMapping("/evenement")
    void ajoutAffectEvenParticip(@RequestBody Evenement evenement) {
        service.ajoutAffectEvenParticip(evenement);
    }

    @PostMapping("/logistique")
    void ajoutAffectLogEvnm(@RequestBody Logistique logistique, String descriptionEvnmt) {
        service.ajoutAffectLogEvnm(logistique, descriptionEvnmt);
    }

    @GetMapping("/participants")
    public List<Participant> getParticipantsWithNonReservedLogistics() {
        return service.getParReservLogis();
    }

    @GetMapping("/logistique")
    public Set<Logistique> getLogistiquesDate(
            @RequestParam("dateDeb") LocalDate dateDeb,
            @RequestParam("dateFin") LocalDate dateFin) {
        return service.getLogistiquesDate(dateDeb, dateFin);
    }



}
