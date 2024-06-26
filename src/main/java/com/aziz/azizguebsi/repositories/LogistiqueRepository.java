package com.aziz.azizguebsi.repositories;

import com.aziz.azizguebsi.models.Logistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface LogistiqueRepository extends JpaRepository<Logistique, Long> {
    @Query("select logistique from Logistique logistique JOIN Evenement evenement ON logistique.idLog = evenement.id where evenement.dateDebut < :dateDebut and evenement.dateFin > :dateFin")
    Set<Logistique> findLogistiqueByEventDates(@Param("dateDebut") LocalDate dateDebut, @Param("dateFin") LocalDate dateFin);
}
