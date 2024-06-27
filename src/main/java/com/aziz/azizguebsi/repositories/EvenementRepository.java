package com.aziz.azizguebsi.repositories;

import com.aziz.azizguebsi.models.Evenement;
import com.aziz.azizguebsi.models.Logistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Set;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long> {
    Evenement findByDescription(String description);
    @Query("select e from Evenement e where e.dateDebut between :dateDeb and :dateFin")
    Set<Evenement> findEventsByDateRange(@Param("dateDeb") LocalDate dateDeb, @Param("dateFin") LocalDate dateFin);
}
