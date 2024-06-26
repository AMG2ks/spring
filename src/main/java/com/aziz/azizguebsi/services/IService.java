package com.aziz.azizguebsi.services;

import com.aziz.azizguebsi.models.Evenement;
import com.aziz.azizguebsi.models.Logistique;
import com.aziz.azizguebsi.models.Participant;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IService {
    void ajouterParticipant(Participant participant);
    Evenement ajoutAffectEvenParticip(Evenement evenement);

    Logistique ajoutAffectLogEvnm(Logistique l, String descriptionEvnmt);

    Set<Logistique> getLogistiquesDate(LocalDate dateDeb, LocalDate dateFin);

    Set<Participant> getParReservLogis();
}
