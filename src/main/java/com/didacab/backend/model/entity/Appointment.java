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
@Getter
@Setter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long clientId;
    private LocalDate date;
    private LocalTime time;
    private int durationInMinutes;
    @Enumerated(EnumType.STRING)
    private ProcedureList procedure;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


}