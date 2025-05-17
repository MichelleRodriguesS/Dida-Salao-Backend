package com.didacab.backend.model.dto;

import com.didacab.backend.model.ProcedureList;

import java.time.LocalDate;
import java.time.LocalTime;

public record AppointmentResponseDTO(
        Long id,
        LocalDate date,
        LocalTime time,
        int durationInMinutes,
        ProcedureList procedure
) {}