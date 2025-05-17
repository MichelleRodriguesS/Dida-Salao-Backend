package com.didacab.backend.model.entity;

import com.didacab.backend.model.ProcedureList;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    private LocalTime time;

    private int durationInMinutes;

    @Enumerated(EnumType.STRING)
    private ProcedureList procedure;
}