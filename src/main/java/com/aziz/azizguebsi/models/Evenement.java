package com.aziz.azizguebsi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double cout;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Participant> participants;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Logistique> logistiques;
}
