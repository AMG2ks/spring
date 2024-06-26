package com.aziz.azizguebsi.repositories;

import com.aziz.azizguebsi.models.Evenement;
import com.aziz.azizguebsi.models.Logistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long> {
    Evenement findByDescription(String description);
}
