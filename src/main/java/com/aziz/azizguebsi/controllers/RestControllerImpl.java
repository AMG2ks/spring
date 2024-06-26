package com.aziz.azizguebsi.controllers;

import com.aziz.azizguebsi.models.Evenement;
import com.aziz.azizguebsi.models.Logistique;
import com.aziz.azizguebsi.models.Participant;
import com.aziz.azizguebsi.services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

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

    @GetMapping("/participant")
    void getParReservLogis() {
        service.getParReservLogis();
    }

    @GetMapping("/logistique")
    void getLogistiquesDate(LocalDate dateDeb, LocalDate dateFin) {
        service.getLogistiquesDate(dateDeb, dateFin);
    }



}
