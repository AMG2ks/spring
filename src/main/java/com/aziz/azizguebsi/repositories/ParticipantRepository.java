package com.aziz.azizguebsi.repositories;

import com.aziz.azizguebsi.models.Evenement;
import com.aziz.azizguebsi.models.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    @Query("SELECT DISTINCT p FROM Participant p JOIN p.evenements e LEFT JOIN e.logistiques l WHERE p.tache = 'ORGANISATEUR' AND (l IS NULL OR l.reserve = false)")
    List<Participant> findParticipantsWithNonReservedLogistics();

}
