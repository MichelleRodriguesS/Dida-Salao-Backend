package com.didacab.backend.model.dto;

import com.didacab.backend.model.ProcedureList;

import java.time.LocalDate;
import java.time.LocalTime;


public record AppointmentRequestDTO(
        Long clientId,
        LocalDate date,
        LocalTime time,
        ProcedureList procedure
){}
