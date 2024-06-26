package com.aziz.azizguebsi.services;

import com.aziz.azizguebsi.models.Evenement;
import com.aziz.azizguebsi.models.Logistique;
import com.aziz.azizguebsi.models.Participant;
import com.aziz.azizguebsi.repositories.EvenementRepository;
import com.aziz.azizguebsi.repositories.LogistiqueRepository;
import com.aziz.azizguebsi.repositories.ParticipantRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
@Slf4j
public class ServiceImpl implements IService {
    EvenementRepository evenementRepository;
    LogistiqueRepository logistiqueRepository;
    ParticipantRepository participantRepository;
    //@Scheduled(fixedRate = 60000) //every minute
    //@Scheduled(fixedDelay = 60000) //every minute after the last execution is finished
//    @Scheduled(cron = "* * * * * *") //cron = "second minute hour day month dayOfWeek"
//    void testScheduler() {
//        log.info("Scheduler is working");
//    }

    @Override
    public void ajouterParticipant(Participant participant) {
        participantRepository.save(participant);
    }

    @Override
    public Evenement ajoutAffectEvenParticip(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    @Override
    public Logistique ajoutAffectLogEvnm(Logistique logistique, String descriptionEvnmt) {
        return logistiqueRepository.save(logistique);
    }

    @Override
    public Set<Logistique> getLogistiquesDate(LocalDate dateDeb, LocalDate dateFin) {
        return logistiqueRepository.findLogistiqueByEventDates(dateDeb, dateFin);
    }

    @Override
    public Set<Participant> getParReservLogis() {
        return participantRepository.findParticipantsWithReservedLogistics();
    }
}
