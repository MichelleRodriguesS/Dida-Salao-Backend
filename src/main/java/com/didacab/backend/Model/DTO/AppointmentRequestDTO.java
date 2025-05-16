package com.didacab.backend.Model.DTO;

import com.didacab.backend.Model.ProcedureList;

import java.time.LocalDate;
import java.time.LocalTime;



public record AppointmentRequestDTO(
        LocalDate date,
        LocalTime time,
        ProcedureList procedure
){}
