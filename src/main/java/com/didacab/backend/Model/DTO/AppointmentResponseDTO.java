package com.didacab.backend.Model.DTO;

import com.didacab.backend.Model.ProcedureList;

import java.time.LocalDate;
import java.time.LocalTime;

public record AppointmentResponseDTO(
        Long id,
        LocalDate date,
        LocalTime time,
        int durationInMinutes,
        ProcedureList procedure
) {}